package team_001;

public class ItemFactory {
	
	public static VirtualBook createVirtualBook(String title, String author) {
		return new VirtualBook(title, author);
	}
	
	public static PhysicalBook createPhysicalBook(String title, String author) {
		return new PhysicalBook(title, author);
	}
	
	public static Magazine createMagazine(String title, String author) {
		return new Magazine(title, author);
	}
	
	public static CD createCD(String title, String author) {
		return new CD(title, author);
	}
	
	public static Newsletter createNewsLetter(String title, String author) {
		return new Newsletter(title, author);
	}
}
