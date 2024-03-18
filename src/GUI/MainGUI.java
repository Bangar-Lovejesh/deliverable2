package GUI;
import team_001.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Font;

public class MainGUI {

    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private String csvFilePath = "C:\\Users\\Gurdip Kuddu\\Desktop\\team_001\\src\\team_001\\ItemDatabase.txt"; // Update with your CSV file path

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
        frame.setBounds(100, 100, 450, 300);
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
        
        UserManagement usermangement = new UserManagement(csvFilePath);
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                if (usermangement.readUsers(username, password)) {
                    openNewScreen();
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password", "Login Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        ArrayList<Client> list = new  ArrayList<>();

        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               list.add(openRegistrationPage(usermangement)); 
            }
        });
        
      
    
    }

    private boolean checkCredentials(String username, String password) {
        // Implement your login logic here
        return false; // Placeholder, always return false for now
    }

    private Client openRegistrationPage(UserManagement m) {
        JFrame registerFrame = new JFrame("Registration");
        registerFrame.setBounds(100, 100, 450, 300);
        registerFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        registerFrame.getContentPane().setLayout(null);

        JLabel lblRegister = new JLabel("Register");
        lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblRegister.setBounds(180, 20, 100, 30);
        registerFrame.getContentPane().add(lblRegister);

        JLabel lblName = new JLabel("Name:");
        lblName.setBounds(40, 60, 80, 14);
        registerFrame.getContentPane().add(lblName);

        JTextField nameField = new JTextField();
        nameField.setBounds(130, 57, 250, 20);
        registerFrame.getContentPane().add(nameField);
        nameField.setColumns(10);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setBounds(40, 90, 80, 14);
        registerFrame.getContentPane().add(lblEmail);

        JTextField emailField = new JTextField();
        emailField.setBounds(130, 87, 250, 20);
        registerFrame.getContentPane().add(emailField);
        emailField.setColumns(10);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setBounds(40, 120, 80, 14);
        registerFrame.getContentPane().add(lblPassword);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(130, 117, 250, 20);
        registerFrame.getContentPane().add(passwordField);

        JLabel lblType = new JLabel("Type:");
        lblType.setBounds(40, 150, 80, 14);
        registerFrame.getContentPane().add(lblType);

        JComboBox<String> typeComboBox = new JComboBox<String>();
        typeComboBox.setBounds(130, 147, 250, 20);
        typeComboBox.addItem("Student");
        typeComboBox.addItem("Faculty");
        typeComboBox.addItem("Visitor");
        typeComboBox.addItem("Non-Faculty Staff");
        registerFrame.getContentPane().add(typeComboBox);

        JButton btnSubmit = new JButton("Submit");
        btnSubmit.setBounds(180, 200, 89, 23);
        registerFrame.getContentPane().add(btnSubmit);
        ArrayList<Client> list = new ArrayList<>();
        btnSubmit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Retrieve values from fields
                String name = nameField.getText();
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());
                String type = (String) typeComboBox.getSelectedItem();

                // Perform registration
                Client c = m.writeUser(name, password, email, type);
                list.add(c);
                if (c != null) {
                    JOptionPane.showMessageDialog(registerFrame, "Registration successful", "Success",
                            JOptionPane.INFORMATION_MESSAGE);
                    registerFrame.dispose(); // Close registration frame
                } else {
                    JOptionPane.showMessageDialog(registerFrame, "Registration failed", "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        registerFrame.setVisible(true);

        return list.get(0); 
    }

    private void openNewScreen() {
        frame.dispose(); // Close current frame

        JFrame newFrame = new JFrame();
        newFrame.setBounds(100, 100, 450, 300);
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        newFrame.getContentPane().setLayout(null);

        // Add your components for the new screen here
        JLabel lblWelcome = new JLabel("Welcome to the New Screen!");
        lblWelcome.setBounds(40, 30, 200, 14);
        newFrame.getContentPane().add(lblWelcome);

        JTextArea textArea = new JTextArea();
        textArea.setBounds(40, 60, 350, 150);
        newFrame.getContentPane().add(textArea);

        try {
            BufferedReader reader = new BufferedReader(new FileReader(csvFilePath));
            String line;
            while ((line = reader.readLine()) != null) {
                textArea.append(line + "\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        newFrame.setVisible(true);
    }

}
