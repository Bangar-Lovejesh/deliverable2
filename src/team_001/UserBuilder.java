package team_001;

import java.util.ArrayList;

class UserBuilder {
    private String email;
    private String password;
    private String username;
    private Library lib;
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
        return password.length() >= 0;
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
        if (email == null || password == null) {
            throw new IllegalStateException("Email and password are required");
        }
        return new Faculty(username, email, password);
    }
    
    public Client buildStudent() {
        if (email == null || password == null) {
            throw new IllegalStateException("Email and password are required");
        }
        return new Student(username, email, password, new ArrayList<>());
    }

    public Client buildNonFacultyStaff() {
        if (email == null || password == null) {
            throw new IllegalStateException("Email and password are required");
        }
        return new NonFacultyStaff(username, email, password);
    }
    
    public Client buildVisitor() {
        if (email == null || password == null) {
            throw new IllegalStateException("Email and password are required");
        }
        return new visitor(username, email, password);
    }
    
}
