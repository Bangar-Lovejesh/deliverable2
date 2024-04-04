package team_001;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryTest {
	private Client client;
    private Item item;
    private Library library;
	
	@BeforeEach
    public void setUp() {
        client = new Faculty("test_user", "test@example.com", "password123");
        item = new PhysicalBook("Book", "1234");
        library = new Library("src\\team_001\\Inventory.txt");
    }
	
	
	@Test
	void testClient() {
		assertEquals("test_user", client.getUsername());
		assertEquals("test@example.com", client.getEmail());
		assertEquals("password123", client.getPassword());
		client.setUsername("t");
		client.setEmail("e");
		client.setPassword("p");
		client.setId(-1);
		assertEquals("t", client.getUsername());
		assertEquals("e", client.getEmail());
		assertEquals("p", client.getPassword());
		assertTrue(-1 == client.getId());
	}
	
	@Test
	void testOverduedItem( ) {
		
	}
    @Test
    public void testCheckItemsOverdue_NoOverdueItems() {
        // Set up borrowed items with no overdue items
        client.borrowed.put(item, LocalDate.now().plusDays(5));
        BorrowedIterator borrowedIterator = new BorrowedIterator(client.borrowed);
        
        ArrayList<Item> overdueItems = client.checkItemsOverdue(borrowedIterator);

        assertTrue(overdueItems.isEmpty());
    }

    @Test
    public void testCheckItemsOverdue_WithOverdueItems() {
        // Set up borrowed items with overdue items
        client.borrowed.put(item, LocalDate.now().minusDays(2));
        BorrowedIterator borrowedIterator = new BorrowedIterator(client.borrowed);
        
        ArrayList<Item> overdueItems = client.checkItemsOverdue(borrowedIterator);

        assertFalse(overdueItems.isEmpty());
        assertEquals(1, overdueItems.size());
        assertEquals(item, overdueItems.get(0));
    }

    @Test
    public void testCheckOverdue_NoDueDate() {
        int overdueDays = client.checkOverdue(item);

        assertEquals(0, overdueDays);
    }

    @Test
    public void testSubscribeAndUnsubscribe() {
        Newsletter newsletter = new Newsletter("Newsletter1", "author");
        
        client.subscribe(newsletter);
        assertTrue(client.getSubcribed().containsKey(newsletter));

        client.unsubscribe(newsletter);
        assertFalse(client.getSubcribed().containsKey(newsletter));
    }

    @Test
    public void testBorrowItem_SuccessfulBorrow() {
        assertFalse(client.borrowItem(item));
        assertFalse(client.isBorrowed(item));
    }

    @Test
    public void testReturnItem() {
        client.borrowed.put(item, LocalDate.now().plusDays(15));
        client.returnItem(item);

        assertFalse(client.isBorrowed(item));
    }
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

	@Test 
	void testBorrowed() {
		 HashMap<Item, LocalDate> borrowed = new HashMap<>();
	     Item item = ItemFactory.createPhysicalBook("Test Book", "Test Author");
	     borrowed.put(item, LocalDate.now().minusDays(10));
	     
	     Client client = new Faculty("username", "string", "password");
	     client.setBorrowed(borrowed);
	     BorrowedIterator iterator = new BorrowedIterator(borrowed);
	     
	     assertTrue(client.checkItemsOverdue(iterator).size() == 1);
	     
	     assertTrue(client.checkOverdue(item) == -10);
	     
	     
	}
	
	 @Test
	    public void testSetEmail_ValidEmail() {
	        UserBuilder userBuilder = new UserBuilder();
	        String validEmail = "test@example.com";

	        UserBuilder returnedUserBuilder = userBuilder.setEmail(validEmail);

	        assertEquals(validEmail, userBuilder.email);
	        assertEquals(userBuilder, returnedUserBuilder);
	    }

	    @Test()
	    public void testSetEmail_InvalidEmail() {
	        UserBuilder userBuilder = new UserBuilder();
	        String invalidEmail = "invalid_email";
	        assertThrows(IllegalArgumentException.class, () -> {
	        	userBuilder.setEmail(invalidEmail); // This call should throw an IllegalArgumentException
	        });
	   
	    }

	    @Test
	    public void testSetPassword_ValidPassword() {
	        UserBuilder userBuilder = new UserBuilder();
	        String validPassword = "strongPassword123";

	        UserBuilder returnedUserBuilder = userBuilder.setPassword(validPassword);

	        assertEquals(validPassword, userBuilder.password);
	        assertEquals(userBuilder, returnedUserBuilder);
	    }

	    @Test()
	    public void testSetPassword_InvalidPassword() {
	        UserBuilder userBuilder = new UserBuilder();
	        String invalidPassword = "";
	        assertThrows(IllegalArgumentException.class, () -> {
	        	  userBuilder.setPassword(invalidPassword); // This call should throw an IllegalArgumentException
	        });
	
	    }

	    @Test
	    public void testBuildFaculty() {
	        UserBuilder userBuilder = new UserBuilder();
	        userBuilder.setEmail("faculty@example.com").setPassword("facultyPass").setUsername("FacultyUser");

	        Client faculty = userBuilder.buildFaculty();

	        assertNotNull(faculty);
	        assertTrue(faculty instanceof Faculty);
	        
	 
	    }

	    @Test
	    public void testBuildStudent() {
	        UserBuilder userBuilder = new UserBuilder();
	        userBuilder.setEmail("student@example.com").setPassword("studentPass").setUsername("StudentUser");

	        Client student = userBuilder.buildStudent();

	        assertNotNull(student);
	        assertTrue(student instanceof Student);
	    }

	    @Test
	    public void testBuildNonFacultyStaff() {
	        UserBuilder userBuilder = new UserBuilder();
	        userBuilder.setEmail("staff@example.com").setPassword("staffPass").setUsername("StaffUser");

	        Client staff = userBuilder.buildNonFacultyStaff();

	        assertNotNull(staff);
	        assertTrue(staff instanceof NonFacultyStaff);
	    }

	    @Test
	    public void testBuildVisitor() {
	        UserBuilder userBuilder = new UserBuilder();
	        userBuilder.setEmail("visitor@example.com").setPassword("visitorPass").setUsername("VisitorUser");

	        Client visitor = userBuilder.buildVisitor();

	        assertNotNull(visitor);
	    }
	    
	    @Test
	    public void testBuildLib() {
	        UserBuilder userBuilder = new UserBuilder();
	        userBuilder.setLibrary(new Library("src\\team_001\\Inventory.txt"));

	        assertNotNull(userBuilder.lib);
	    }

}

