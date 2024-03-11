package team_001;

import java.util.HashMap;

public class Client {
	private String username;
	private int id;
	private String email;
	private String password;
	private HashMap<Object,String> borrowed;
	private HashMap<Object, String> subscribed;

	public Client(String username, int id, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.id = id;
	}

//	
//	public Client(String username2, int id2, String email2, String password2) {
//		// TODO Auto-generated constructor stub
//	}


	public Object checkItemsOverdue(){
		return null;
	}
	
	public int checkOverdraft(){
		return 0;
		
	}
	
	public String getUsername() {
		return username;
	}
	
	public int getId(){
		return id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getPassword() {
		return password;
	}
	
	public Boolean ifBorrowed() {
		return false;
	}
	
	public HashMap<Object, String> getSubcribed(){
		return subscribed;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setBorrowed(HashMap<Object,String> borrowed) {
		this.borrowed = borrowed;
	}
	public void subscribe(Object object) {
		
	}
	public void unsubscribe(Object object) {
		
	}
	
	public void borrowItem() {
		
	}
	public void returnItem() {
		
	}
}
