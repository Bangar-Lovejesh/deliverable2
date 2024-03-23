package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import team_001.Client;
import team_001.Item;
import team_001.LibraryFacade;

public class libraryBookingGUI {

	private JFrame frame;
	private JComboBox<String> itemComboBox;
	private LibraryFacade libraryfacade;
    static int bookOwed = 0;
    private ArrayList<String> currUserItems;
    private Client client;
    private String currUser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					libraryBookingGUI window = new libraryBookingGUI();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

	/**
	 * Create the application.
	 * @param libraryfacade 
	 * @param currUser 
	 * @param currUserItems 
	 * @param client 
	 */
	public libraryBookingGUI(LibraryFacade libraryfacade, String currUser, ArrayList<String> currUserItems, Client client) {
		this.libraryfacade = libraryfacade;
		this.currUserItems = currUserItems;
		this.client = client;
		this.currUser = currUser;
//		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public LibraryFacade initialize() {
    	
//        frame.dispose(); // Close current frame

        JFrame newFrame = new JFrame();
        newFrame.setBounds(400, 400, 600, 600); // Adjust frame size as needed
        newFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newFrame.getContentPane().setLayout(null);
        
        DefaultListModel<String> listModel = new DefaultListModel<>(); // Create a list model
        LocalDate today = LocalDate.now();
        
        
//       For selecting from Drop down menu
        JLabel lblWelcome = new JLabel("Select an Item:");
        lblWelcome.setBounds(40, 30, 150, 14);
        newFrame.getContentPane().add(lblWelcome);
        
        JButton btnSelect = new JButton("Rent/Subscribe");
        btnSelect.setBounds(230, 50, 130, 23);
        newFrame.getContentPane().add(btnSelect);
        
        itemComboBox = new JComboBox<>(); // ItemComboBox is the drop down menu
        itemComboBox.setBounds(180, 27, 250, 20); // Adjust combo box size as needed
        newFrame.getContentPane().add(itemComboBox);
        for(Item item: libraryfacade.getInventory().values()) {
//        	This is adding values to the drop down menu
    		itemComboBox.addItem(item.getID() + " " +item.getTitle()); 
    	}
        
        btnSelect.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) itemComboBox.getSelectedItem(); // Get selected item
                int id = Integer.parseInt(selectedItem.split(" ")[0]);
                if (selectedItem != null) {
                    // You can store the selected item in a variable or perform any other action here
                	
                	if(bookOwed <= 3)
                	{if (currUserItems.size() <10){
                		 System.out.println(selectedItem);
                         
                         String bookWithDate = selectedItem + ":" + today.toString();
                         if(client.borrowItem(libraryfacade.getInventory().get(id))) {
                         currUserItems.add(bookWithDate);
                         listModel.addElement(selectedItem); // Add to list model
                         JOptionPane.showMessageDialog(newFrame, currUser + " selected: " + selectedItem.split(" ")[1], "Selected Item",
                                 JOptionPane.INFORMATION_MESSAGE);                   
                         
                         libraryfacade.bookKeeping(currUser, currUserItems);}
                         else {
                        	 JOptionPane.showMessageDialog(newFrame, "No more books", "return some",
                                     JOptionPane.ERROR_MESSAGE);
                         }
       
                }else{
                	JOptionPane.showMessageDialog(newFrame, "Renting Limit Reached", "CAN ONLY RENT 10 AT A TIME. RETURN TO PROCEEd",
                        JOptionPane.ERROR_MESSAGE);
                	} }
                	else {
                		JOptionPane.showMessageDialog(newFrame, "You owe too many books", "Return some to continue",
                                JOptionPane.ERROR_MESSAGE);
                		
                	}
                }else {
                
                	
                    JOptionPane.showMessageDialog(newFrame, "Please select an item", "No Item Selected",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
        
        
        
        
        
//        for search functionality
        JLabel lblSearch = new JLabel("Search for an Item:");
        lblSearch.setBounds(40, 80, 150, 14);
        newFrame.getContentPane().add(lblSearch);
        
        JTextField searchField = new JTextField();
        searchField.setBounds(180, 80, 250, 20);
        newFrame.getContentPane().add(searchField);
        

        JButton btnSearch = new JButton("Search");
        btnSearch.setBounds(450, 80, 80, 20);
        newFrame.getContentPane().add(btnSearch);
        
//        Adding books to an array list to search from
        ArrayList<String> bookList = new ArrayList<String>();
        for(Item item: libraryfacade.getInventory().values()) {
    		bookList.add(item.getID() + " " +item.getTitle());
    	}
        
//        This is the box right below the search to show the result
        DefaultListModel<String> searchListModel = new DefaultListModel<>(); // Create a list model for search results
        JList<String> searchList = new JList<>(searchListModel); // Create a JList with the list model for search results
        JScrollPane searchScrollPane = new JScrollPane(searchList); // Add the JList to a scroll pane
        searchScrollPane.setBounds(40, 120, 500, 50); // Adjust scroll pane size as needed
        newFrame.getContentPane().add(searchScrollPane);
        
        
        btnSearch.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String query = searchField.getText().toLowerCase();
                searchListModel.clear(); // Clear previous search results
                for (String item : bookList) {
                    if (item.toLowerCase().contains(query)) {
                        searchListModel.addElement(item); // Add matching items to the search list model
                    }
                }
            }
        });
        
        JButton btnSelectRent = new JButton("Rent/Subscribe(search)");
        btnSelectRent.setBounds(210, 180, 170, 23);
        newFrame.getContentPane().add(btnSelectRent);
        
        btnSelectRent.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
                // Add your return action here
                // This action will be performed when the "Return" button is clicked
                // For example, you can remove the selected item from currUserItems and update the list model
                String selectedItem = searchList.getSelectedValue();               
                if (selectedItem != null) {
                	int id = Integer.parseInt(selectedItem.split(" ")[0]);
                    if(bookOwed <= 3)
                	{if (currUserItems.size() <10){
                		 System.out.println(selectedItem);
                         
                		 
                         String bookWithDate = selectedItem + ":" + today.toString();
//                        the client.borrowItem simultaneously checks if we have enough books in the inventory to rent
//                        and updates it accordingly. which means it substracts one from the book we have
//                         and if we have zero it'll return false and we'll get
                         if(client.borrowItem(libraryfacade.getInventory().get(id))) {
                         currUserItems.add(bookWithDate);
                         listModel.addElement(selectedItem); // Add to list model, which is a box above the return button
                         JOptionPane.showMessageDialog(newFrame, currUser + " selected: " + selectedItem.split(" ")[1], "Selected Item",
                                 JOptionPane.INFORMATION_MESSAGE);                   

//                         This basically updates the booksOwed.txt db, which means it add to whatever book the current logged in user
//                         is renting
                         libraryfacade.bookKeeping(currUser, currUserItems);} 
                         else {
                        	 JOptionPane.showMessageDialog(newFrame, "No more books", "return some",
                                     JOptionPane.ERROR_MESSAGE);
                         }
       
                }else{
                	JOptionPane.showMessageDialog(newFrame, "Renting Limit Reached", "CAN ONLY RENT 10 AT A TIME. RETURN TO PROCEEd",
                        JOptionPane.ERROR_MESSAGE);
                	} }
                	else {
                		JOptionPane.showMessageDialog(newFrame, "You owe too many books", "Return some to continue",
                                JOptionPane.ERROR_MESSAGE);
                		
                	}
                }else {
                
                	
                    JOptionPane.showMessageDialog(newFrame, "Please select an item", "No Item Selected",
                            JOptionPane.ERROR_MESSAGE);
                }
            
            }
        });        
        
        
              
        
        
        
        
//        for Return        
//        This following lines makes the box thats right above the return button
        JList<String> itemList = new JList<>(listModel); 
        JScrollPane scrollPane = new JScrollPane(itemList); 
        scrollPane.setBounds(40, 250, 500, 100); 
        newFrame.getContentPane().add(scrollPane);
        
        JButton btnReturn = new JButton("Return");
        btnReturn.setBounds(250, 370, 80, 20);
        newFrame.getContentPane().add(btnReturn);
        
        
//        here we are reading from 
//        we were populating the currUserItems with items owed by current user from booksOwed
//        but we are doing it in populizer in library.java so I'll comment it out.
//        Leaving this for ref
//        String line;
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
//            while ((line = br.readLine()) != null) {
//                String[] parts = line.split(";");
//                if (parts[0].equals(currUser)) {
//                    for (int i = 1; i < parts.length; i++) {
//                        String[] bookAndDate = parts[i].split(":");
//                        String book = bookAndDate[0];
//                        String date = bookAndDate[1];
//                        currUserItems.add(book + " (" + date + ")");
//                    }
//                }
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        ArrayList<String> temp = new ArrayList<String>();
        boolean bookDueSoon = false;
        boolean bookOverdue = false;
        long daysDifference = 0;
        
//       In the following logic, I am moving stuff from currUserItemt -> temp
//        if any item in currUserItem is overdue, it will be added to temp with the prefix OWED look to line 468
//        then we'll move it back to currUserItem to populate that box right above return button
        for (String item : currUserItems) {
            String[] parts = item.split(":");
            String book = parts[0];
            String date = parts[1];
            LocalDate dateFromDB = LocalDate.parse(date, formatter);
            daysDifference = java.time.temporal.ChronoUnit.DAYS.between(dateFromDB, today);
            if(daysDifference > 15) {
            	continue;
            }
            if(daysDifference>=9) {
            	bookDueSoon = true;
            }
            
            if(daysDifference >=10) {
            	bookOwed++;      
            	temp.add(book + ":" + date + ":Owed");
            }
            else {
            	temp.add(item);
            }
            
        }
        
        // Populate the return item box with currUserItems
        currUserItems = temp;
        
        for(String s : currUserItems) {
        	String[] parts = s.split(":");
        	System.out.println(s);
        	if(parts.length == 3) {
        		listModel.addElement(parts[0] + "     Due: " + parts[1] + "    *OVERDUE");
        	}
        	else {
        		listModel.addElement(parts[0] + "     Due: " + parts[1]);
        	}
        	
        }
        
//        this thing basical removes from currUserItem whatever is selected based on the index
//        and then updates the booksOwed
        btnReturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Add your return action here
                // This action will be performed when the "Return" button is clicked
                // For example, you can remove the selected item from currUserItems and update the list model
                String selectedItem = itemList.getSelectedValue();
                itemList.getSelectedIndex();
                
                if (selectedItem != null) {
                	int id = Integer.parseInt(selectedItem.split(" ")[0]);
                	currUserItems.remove(itemList.getSelectedIndex());
                	
//                    for(String s: currUserItems) {
//                    	System.out.println("btn Return " + s);
//                    }
                    
                    listModel.removeElement(selectedItem);
//                  This basically updates the booksOwed.txt db, which means it add to whatever book the current logged in user
//                  is renting.
                    libraryfacade.bookKeeping(currUser, currUserItems);
                    System.out.println(libraryfacade.getInventory().get(id));
                    client.returnItem(libraryfacade.getInventory().get(id));
                } 
                else {
                    JOptionPane.showMessageDialog(newFrame, "Please select an item to return", "No Item Selected",
                            JOptionPane.ERROR_MESSAGE);
                }
            
            }
        });
        
        newFrame.setVisible(true);
        if(bookDueSoon){
    		JOptionPane.showMessageDialog(newFrame, "YOU HAVE SOME BOOKS OVERDUE SOON", "OVERDUE NOTICE",
                    JOptionPane.ERROR_MESSAGE);
    	}
        
        return this.libraryfacade;
	}
	
	

}
