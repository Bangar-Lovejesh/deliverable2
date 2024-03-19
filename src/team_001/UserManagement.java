package team_001;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserManagement {
    private String csvPath;

    public UserManagement(String csvPath) {
        this.csvPath = csvPath;
    }

    //name,id,email,password
    public boolean readUsers(String name, String password) {
    	System.out.println("here 2");
        try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String email = parts[2];
                String password1 = parts[3];
                if(email.equals(name) && password1.equals(password)) {
                	return true;
                }
              
                
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }


    public Client writeUser(String name, String password, String email, String type) {
    		if(name == null || password == null || email == null) return null;
    	
    	  try (BufferedReader br = new BufferedReader(new FileReader(csvPath))) {
              String line;
              while ((line = br.readLine()) != null) {
                  String[] parts = line.split(",");
                  String email1 = parts[2];
                  if(email1.equals(email)) {
                  	return null;
                  }
              }
          } catch (IOException e) {
              e.printStackTrace();
          }
    	  //String username, String email, String password, Library libary
    	  Client client;
    	  if(type.equals("Student")) {
    		  client = new Student(email,password, new ArrayList<>());
    	  } else if(type.equals("Faculty")) {
    		  client = new Faculty(email,password);
    	  } else if(type.equals("Visitor")) {
    		  client = new visitor(email,password);
    	  } else {
    		  client = new NonFacultyStaff(email,password);
    	  }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvPath, true))) {
        	bw.write("\n"+client.getUsername()+","+client.getId()+","+client.getEmail()+","+client.getPassword());
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return client;
    }
}
