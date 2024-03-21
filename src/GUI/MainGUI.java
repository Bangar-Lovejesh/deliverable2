package GUI;
import team_001.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;


public class MainGUI {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private String bookFilePath = "src\\team_001\\Inventory.txt";
    private String csvFilePath = "src\\team_001\\UserDatabase.txt";
    private String currUser;
    private LibraryFacade libraryfacade = new LibraryFacade(bookFilePath);
    private JComboBox<String> itemComboBox; // Declare JComboBox
    private ArrayList<String> currUserItems = new ArrayList<String>();
    ArrayList<Client> clientList = new ArrayList<>();
    private Client client;
    String type;
    private boolean bookDueSoon = false;
//    static int bookOwed =0;
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainGUI window = new MainGUI();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public MainGUI() {
    	
        initialize();       
    }
 
	private void initialize() {
        frame = new JFrame();
        frame.setBounds(200, 200, 550, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblNewLabel = new JLabel("Welcome to our Project, group 001");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(40, 89, 342, 40);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblUsername = new JLabel("Username:");
        lblUsername.setBounds(40, 140, 80, 14);
        frame.getContentPane().add(lblUsername);

        usernameField = new JTextField();
        usernameField.setBounds(130, 137, 150, 20);
        frame.getContentPane().add(usernameField);
        usernameField.setColumns(10);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(40, 170, 80, 14);
        frame.getContentPane().add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setBounds(130, 167, 150, 20);
        frame.getContentPane().add(passwordField);

        JButton btnLogin = new JButton("Login");
        btnLogin.setBounds(100, 200, 89, 23);
        frame.getContentPane().add(btnLogin);

        JButton btnRegister = new JButton("Register");
        btnRegister.setBounds(200, 200, 89, 23);
        frame.getContentPane().add(btnRegister);
        ArrayList<Client> list = new  ArrayList<>();
//        System.out.println("Here 1");
        UserManagement usermangement = new UserManagement(csvFilePath);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	String name = currUser;
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                String type = usermangement.getType(username);
                if (usermangement.readUsers(username, password)) {
                	currUser = username;
                	if(type.equals("Student")) {
                		System.out.println("inside student if");
              		  client = new Student(name, username,password, new ArrayList<>());
              	  } else if(type.equals("Faculty")) {
              		System.out.println("inside faculty if");
              		  client = new Faculty(name, username,password);
              	  } else if(type.equals("Visitor")) {
              		  client = new visitor(name, username,password);
              	  } else {
              		  client = new NonFacultyStaff(name, username,password);
              	  }
                	libraryfacade.populizer(currUser, currUserItems);
                	libraryBookingGUI libGUI = new libraryBookingGUI(libraryfacade, currUser, currUserItems, client);
                	libraryfacade = libGUI.initialize();
//                	openNewScreen();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password", "Login Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        

        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
//               openRegistrationPage(usermangement);
            	frame.dispose(); // Close current frame
               openRegistrationGUI registration = new openRegistrationGUI(type, usermangement);
               clientList = registration.initialize();
               list.add(clientList.get(0)); 
            }
        });
        
    }

//    private boolean checkCredentials(String username, String password) {
//        // Implement your login logic here
//        return false; // Placeholder, always return false for now
//    }
    
}

