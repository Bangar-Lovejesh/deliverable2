package team_001;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Client {
	private String username;
	private int id;
	private String email;
	private String password;
	private HashMap<Item, LocalDate> borrowed;
	private HashMap<Newsletter, String> subscribed;
	private Library library;
	
	public Client(String username, int id, String email, String password, Library libary) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.id = id;
		this.library = libary;
	}

	public ArrayList<Item> checkItemsOverdue(){
		ArrayList<Item> overdueItems = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        for (Item item : borrowed.keySet()) {
            LocalDate dueDate = this.borrowed.get(item);
            if (currentDate.isAfter(dueDate)) {
                overdueItems.add(item);
            }
        }
        return overdueItems;
	}
	
	public int checkOverdue(Item item){
		LocalDate dueDate = borrowed.get(item);
        if (dueDate != null) {
            LocalDate currentDate = LocalDate.now();
            return (int) currentDate.until(dueDate).getDays(); 
        }
        return 0;
	}
	
	public void subscribe(Newsletter newsletter) {
		this.subscribed.put(newsletter, "");
	}
	public void unsubscribe(Newsletter newsletter) {
		this.subscribed.remove(newsletter);
	}
	
	public void borrowItem(Item item) {
		this.library.borrowItem(this, item);
		
		LocalDate dueDate = LocalDate.now().plusDays(30);
		this.borrowed.put(item, dueDate);
	}
	
	public void returnItem(Item item) {
		this.library.returnItem(this, item);
		this.borrowed.remove(item);
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public Boolean isBorrowed(Item item) {
		return this.borrowed.containsKey(item);
	}
	
	public HashMap<Newsletter, String> getSubcribed(){
		return this.subscribed;
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
	
	public void setBorrowed(HashMap<Item, LocalDate> borrowed) {
		this.borrowed = borrowed;
	}
}
