package team_001;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

abstract public class Client {
	public static int current_id = 3;
	private String username;
	private int id;
	private String email;
	private String password;
	private HashMap<Item, LocalDate> borrowed = new HashMap<Item, LocalDate>();
	private HashMap<Newsletter, String> subscribed;
	private Library library;
	
	public Client(String username, String email, String password) {
		this.username = username;
		this.email = email;
		this.password = password;
		this.id = ++Client.current_id;
		library = new Library("src\\team_001\\Inventory.txt");
	}
	
	public ArrayList<Item> checkItemsOverdue(BorrowedIterator iterator){
		ArrayList<Item> overdueItems = new ArrayList<>();
        LocalDate currentDate = LocalDate.now();
        while(iterator.hasNext()) {
        	Item key = iterator.next();
        	LocalDate val = borrowed.get(key);
        	 if (currentDate.isAfter(val)) {
                 overdueItems.add(key);
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
	
	public boolean borrowItem(Item item) {
		System.out.println("start of client.borrow");
		if(this.library.borrowItem(this, item)) {
		LocalDate dueDate = LocalDate.now().plusDays(30);
		this.borrowed.put(item, dueDate);
		System.out.println("end of client.borrow");
		return true;}
		else {
			return false;
		}
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
	
	public void addCourse() {
		
	}
}
