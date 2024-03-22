package GUI;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import team_001.Client;
import team_001.PasswordValidator;
import team_001.UserManagement;

public class openRegistrationGUI {

	private JFrame frame;
	private String type;
	private UserManagement userManagement;
	private ArrayList<Client> clientList = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					openRegistrationGUI window = new openRegistrationGUI("Test", new UserManagement("src\\team_001\\UserDatabase.txt"));
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * @param actionListener 
	 */
	public openRegistrationGUI(String type, UserManagement m) {
		this.type = type;
		this.userManagement = m;
//		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public ArrayList<Client> initialize() {		
        frame = new JFrame("Registration");
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JLabel lblRegister = new JLabel("Register");
        lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblRegister.setBounds(180, 20, 100, 30);
        frame.getContentPane().add(lblRegister);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(40, 60, 80, 14);
        frame.getContentPane().add(lblName);

        JTextField nameField = new JTextField();
        nameField.setBounds(130, 57, 250, 20);
        frame.getContentPane().add(nameField);
        nameField.setColumns(10);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(40, 90, 80, 14);
        frame.getContentPane().add(lblEmail);

        JTextField emailField = new JTextField();
        emailField.setBounds(130, 87, 250, 20);
        frame.getContentPane().add(emailField);
        emailField.setColumns(10);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(40, 120, 80, 14);
        frame.getContentPane().add(lblPassword);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(130, 117, 250, 20);
        frame.getContentPane().add(passwordField);

        JLabel lblType = new JLabel("Type:");
        lblType.setBounds(40, 150, 80, 14);
        frame.getContentPane().add(lblType);

        JComboBox<String> typeComboBox = new JComboBox<String>();
        typeComboBox.setBounds(130, 147, 250, 20);
        typeComboBox.addItem("Student");
        typeComboBox.addItem("Faculty");
        typeComboBox.addItem("Visitor");
        typeComboBox.addItem("Non-Faculty Staff");
        frame.getContentPane().add(typeComboBox);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(180, 200, 89, 23);
        frame.getContentPane().add(btnSubmit);
        
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve values from fields
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                type = (String) typeComboBox.getSelectedItem();
                if(PasswordValidator.validatePassword(password)) {
                    // Perform registration
                    Client c = userManagement.writeUser(name, password, email, type);
                    clientList.add(c);
                    if (c != null) {
                        JOptionPane.showMessageDialog(frame, "Registration successful", "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        System.out.println("Inside if " +type);
                        frame.dispose(); // Close registration frame
                    } else {
                        JOptionPane.showMessageDialog(frame, "Registration failed", "Error",
                                JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                	System.out.println(PasswordValidator.hasUppercase(password));
                	System.out.println(PasswordValidator.hasNumber(password));
                	System.out.println(PasswordValidator.hasSymbol(password));
                	System.out.println(PasswordValidator.hasLowercase(password));
                    JOptionPane.showMessageDialog(frame, "Registration failed: Password is not Strong enough", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        frame.setVisible(true);
        
        return clientList;
	}

}
