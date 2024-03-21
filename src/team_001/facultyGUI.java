package team_001;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class facultyGUI {

	public JFrame facultyGUI;
	private Faculty faculty;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					facultyGUI window = new facultyGUI(new Faculty(null, null, null));
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
	 */
	public facultyGUI(Client client) {
		this.faculty = (Faculty) client;
//		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		facultyGUI = new JFrame();
		facultyGUI.setBounds(100, 100, 450, 300);
		facultyGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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

//        // Create JScrollPane and add the JTextArea to it
//        JScrollPane scrollPane = new JScrollPane(textArea);
//        scrollPane.setBounds(10, 31, 414, 58);
//        facultyGUI.getContentPane().add(scrollPane);
    }

}
