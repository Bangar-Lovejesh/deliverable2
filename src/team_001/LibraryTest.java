package team_001;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Test;

class LibraryTest {
	
	@Test
    void testBorrowedIterator() {
        // Create a new HashMap and add an item to it
        HashMap<Item, LocalDate> borrowed = new HashMap<>();
        Item item = ItemFactory.createPhysicalBook("Test Book", "Test Author");
        borrowed.put(item, LocalDate.now());

        // Create a new BorrowedIterator for the HashMap
        BorrowedIterator iterator = new BorrowedIterator(borrowed);

        // Test the hasNext method
        assertTrue(iterator.hasNext(), "hasNext should return true when there are more items");

        // Test the next method
        assertEquals(item, iterator.next(), "next should return the next item");

        // Test the hasNext method again
        assertFalse(iterator.hasNext(), "hasNext should return false when there are no more items");
    }
	
	@Test
    void testClient() {
        // Create a new Client
        Client client;

        client = new Faculty("John Doe", "johndoe@example.com", "Password123");
        assertEquals("John Doe", client.getUsername());
        
       
        

        // Test the borrowItem and isBorrowed methods
        Item item = ItemFactory.createPhysicalBook("Test Book", "Aadil Baig");
//        Library library = new Library("src\\team_001\\Inventory.txt");
        LibraryFacade libraryfacade = new LibraryFacade("src\\team_001\\Inventory.txt");
        
        for(Item temp: libraryfacade.getInventory().values()) {
        	System.out.println("tetsstst " + temp.getID());
        	
        }
        assertTrue(client.borrowItem(libraryfacade.getInventory().get(8)));
        assertTrue(client.borrowItem(libraryfacade.getInventory().get(8)));

        // Test the returnItem method
        client.returnItem(item);
        assertFalse(client.isBorrowed(item));

        // Test the subscribe and getSubscribed methods
        Newsletter newsletter = new Newsletter("Studio News", "Test Author");
        client.subscribe(newsletter);
        assertTrue(client.getSubcribed().containsKey(newsletter));

        // Test the unsubscribe method
        client.unsubscribe(newsletter);
        assertFalse(client.getSubcribed().containsKey(newsletter));

        // Test the setter methods
        client.setUsername("Jane Doe");
        client.setEmail("janedoe@example.com");
        client.setPassword("Password456");
        assertEquals("Jane Doe", client.getUsername());
        assertEquals("janedoe@example.com", client.getEmail());
        assertEquals("Password456", client.getPassword());
    }
	
	@Test
    void testPasswordValidator() {
        // Test the validatePassword method
        assertTrue(PasswordValidator.validatePassword("Test@123"));
        assertFalse(PasswordValidator.validatePassword("test"));

        // Test the hasUppercase method
        assertTrue(PasswordValidator.hasUppercase("Test"));
        assertFalse(PasswordValidator.hasUppercase("test"));

        // Test the hasLowercase method
        assertTrue(PasswordValidator.hasLowercase("Test"));
        assertFalse(PasswordValidator.hasLowercase("TEST"));

        // Test the hasNumber method
        assertTrue(PasswordValidator.hasNumber("Test1"));
        assertFalse(PasswordValidator.hasNumber("Test"));

        // Test the hasSymbol method
        assertTrue(PasswordValidator.hasSymbol("Test@"));
        assertFalse(PasswordValidator.hasSymbol("Test"));
    }
}

