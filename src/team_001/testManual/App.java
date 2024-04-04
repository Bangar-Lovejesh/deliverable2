package team_001.testManual;
import team_001.*;
import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class App {
	
	  private Library library;
	    private Client client;

	    @BeforeEach
	    void setUp() {
	        library = new Library("src\\team_001\\Inventory.txt");
	        client = new Faculty("TestUser", "test@example.com", "password");
	    }


	    @Test
	    void testReturnItem() {
	        Item testItem = new PhysicalBook("Test Title", "Test Author");
	        library.borrowItem(client, testItem);
	        library.returnItem(client, testItem);
	        assertFalse(client.isBorrowed(testItem));
	    }

	    @Test
	    void testCheckOverdue() {
	        Item testItem = new PhysicalBook("Test Title", "Test Author");
	        LocalDate dueDate = LocalDate.now().minusDays(5); // Set due date 5 days ago
	        client.borrowItem(testItem);
	        assertEquals(0, client.checkOverdue(testItem));
	    }

	    @Test
	    void testCheckItemsOverdue() {
	        Item overdueItem1 = new PhysicalBook("Overdue Title 1", "Test Author");
	        Item overdueItem2 = new PhysicalBook("Overdue Title 2", "Test Author");
	        Item notOverdueItem = new PhysicalBook("Not Overdue Title", "Test Author");
	        LocalDate dueDate = LocalDate.now().minusDays(5); // Set due date 5 days ago
	        client.setBorrowed(new HashMap<Item, LocalDate>() {{
	            put(overdueItem1, dueDate);
	            put(overdueItem2, dueDate);
	            put(notOverdueItem, LocalDate.now().plusDays(5)); // Not overdue
	        }});

	        ArrayList<Item> overdueItems = client.checkItemsOverdue(new BorrowedIterator(client.borrowed));
	        assertEquals(2, overdueItems.size());
	        assertTrue(overdueItems.contains(overdueItem1));
	        assertTrue(overdueItems.contains(overdueItem2));
	        assertFalse(overdueItems.contains(notOverdueItem));
	    }

	    @Test
	    void testGetInstance() {
	        Library libraryInstance1 = Library.getInstance("src\\team_001\\Inventory.txt");
	        Library libraryInstance2 = Library.getInstance("src\\team_001\\Inventory.txt");
	        assertSame(libraryInstance1, libraryInstance2);
	    }
	 
	@Test
	    public void testBorrowedIterator() {
	        // Create a HashMap of borrowed items with LocalDate values
	        HashMap<Item, LocalDate> borrowedItems = new HashMap<>();
	        Item item1 = new PhysicalBook("title", "author");
	        Item item2 = new PhysicalBook("title2", "author2");
	        LocalDate date1 = LocalDate.of(2024, 4, 3);
	        LocalDate date2 = LocalDate.of(2024, 4, 4);
	        borrowedItems.put(item1, date1);
	        borrowedItems.put(item2, date2);

	        // Create a BorrowedIterator instance
	        BorrowedIterator iterator = new BorrowedIterator(borrowedItems);

	        // Test hasNext() and next() methods
	        assertTrue(iterator.hasNext());
	        assertEquals(item1, iterator.next());
	        assertTrue(iterator.hasNext());
	        assertEquals(item2, iterator.next());
	        assertFalse(iterator.hasNext());

	       
	 }
}
