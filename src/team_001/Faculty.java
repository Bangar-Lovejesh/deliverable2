package team_001;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Faculty extends Client {
	private String teachingFilePath = "src\\team_001\\teaching.txt";
	
	public Faculty(String username, String email, String password) {
		super(username, email, password);
	}
	
	public ArrayList<String> getCourses(){
		ArrayList<String> courses = new ArrayList<String>();
		String userName = ""; // Default value
        String course = "";
        String books = "";
        
        try (BufferedReader reader = new BufferedReader(new FileReader(teachingFilePath))){
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line by semicolon
                String[] parts = line.split(";");

                // Extract values
                userName = parts[0];
                if(!userName.equals(getEmail())) {
                	System.out.println(userName);
                	System.out.println(this.getEmail());
                	continue;
                }
                
                course = parts[1];
                books = parts[2];
                
                courses.add("Course: " + course + "\nTextbook(s): " + books);
                // Read the next line
                line = reader.readLine();
            }
        } catch (IOException e) {
        	e.printStackTrace();
        }
        
		return courses;
	}
	
}
