package GUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import team_001.Client;
import team_001.Faculty;
import team_001.LibraryFacade;

import javax.swing.JButton;

public class facultyGUI {

	public JFrame facultyGUI;
	private Faculty faculty;
	private LibraryFacade libraryfacade;
	private String currUser;
	private ArrayList<String> currUserItems;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					facultyGUI window = new facultyGUI(new Faculty(null, null, null), new LibraryFacade(""), "", new ArrayList<String>());
					window.facultyGUI.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param client 
	 * @param currUserItems 
	 * @param currUser 
	 * @param libraryfacade 
	 */
	public facultyGUI(Client client, LibraryFacade libraryfacade, String currUser, ArrayList<String> currUserItems) {
		this.faculty = (Faculty) client;
		this.libraryfacade = libraryfacade;
		this.currUser = currUser;
		this.currUserItems = currUserItems;
//		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		facultyGUI = new JFrame();
		facultyGUI.setBounds(100, 100, 450, 300);
		facultyGUI.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		facultyGUI.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Faculty Page");
		lblNewLabel.setBounds(177, 11, 74, 14);
		facultyGUI.getContentPane().add(lblNewLabel);
		facultyGUI.setVisible(true);
		
		JTextArea textArea = new JTextArea();
        textArea.setBounds(10, 31, 414, 58);
        textArea.setEditable(false);
        facultyGUI.getContentPane().add(textArea);

        // Sample ArrayList
        ArrayList<String> coursesTaught = faculty.getCourses();

        // Display ArrayList values in the text area
        StringBuilder sb = new StringBuilder();
        for (String value : coursesTaught) {
            sb.append(value).append("\n"); // Append each value followed by a newline character
        }
        textArea.setText(sb.toString());
        
        JButton btnNewButton = new JButton("Enter Library");
        btnNewButton.setBounds(138, 123, 126, 23);
        facultyGUI.getContentPane().add(btnNewButton);
        
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	libraryBookingGUI libGUI = new libraryBookingGUI(libraryfacade, currUser, currUserItems, (Client) faculty);
            	libraryfacade = libGUI.initialize();
            }
        });
    }
}
