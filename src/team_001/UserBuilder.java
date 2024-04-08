package team_001;

import java.util.ArrayList;

public class UserBuilder {
    public String email;
    public String password;
    private String username;
    public Library lib;
    public UserBuilder setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email format");
        }
        return this;
    }

    private boolean isValidEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }

    public UserBuilder setPassword(String password) {
        // Perform password validation here
        if (isValidPassword(password)) {
            this.password = password;
        } else {
            throw new IllegalArgumentException("Invalid password format");
        }
        return this;
    }

    private boolean isValidPassword(String password) {
        
    	return password.length() > 0;
    }
    
    public UserBuilder setLibrary(Library lib) {
    	this.lib = lib;
    	return this;
    }
    
    public UserBuilder setUsername(String username) {
    	this.username = username;
    	return this;
    }
    
    public Client buildFaculty() {
       
        return new Faculty(username, email, password);
    }
    
    public Client buildStudent() {

        return new Student(username, email, password, new ArrayList<>());
    }

    public Client buildNonFacultyStaff() {
  
        return new NonFacultyStaff(username, email, password);
    }
    
    public Client buildVisitor() {
      
        return new visitor(username, email, password);
    }
    
}
