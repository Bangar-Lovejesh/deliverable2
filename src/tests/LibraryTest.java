package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import team_001.*;

class LibraryTest {
	private Client client;
    private Item item;
    private Library library;
	private UserManagement mange;

	@BeforeEach
    public void setUp() {
        client = new Faculty("test_user", "test@example.com", "password123");
        item = new PhysicalBook("Book", "1234");
        library = new Library("src\\team_001\\Inventorytest.txt", "src\\team_001\\booksOwedtest.txt");
        mange = new UserManagement("src\\team_001\\userdatabasetest.txt");
        mange.writeUser("name", "password", "email", "student");
    }
	
	
    @AfterEach
    public void tearDown() throws IOException {
    	try {
			RandomAccessFile file = new RandomAccessFile("src\\team_001\\userdatabasetest.txt", "rw");
			file.setLength(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
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
	        userBuilder.setLibrary(new Library("src\\team_001\\Inventory.txt", ""));

	        assertNotNull(userBuilder.lib);
	    }
	    @Test
	    public void testCreateVirtualBook() {
	        VirtualBook virtualBook = ItemFactory.createVirtualBook("Title", "Author");
	        assertEquals("Title", virtualBook.getTitle());
	        assertEquals("Author", virtualBook.getAuthor());
	    }

	    @Test
	    public void testCreatePhysicalBook() {
	        PhysicalBook physicalBook = ItemFactory.createPhysicalBook("Title", "Author");
	        assertEquals("Title", physicalBook.getTitle());
	        assertEquals("Author", physicalBook.getAuthor());
	    }

	    @Test
	    public void testCreateMagazine() {
	        Magazine magazine = ItemFactory.createMagazine("Title", "Author");
	        assertEquals("Title", magazine.getTitle());
	        assertEquals("Author", magazine.getAuthor());
	    }

	    @Test
	    public void testCreateCD() {
	        CD cd = ItemFactory.createCD("Title", "Author");
	        assertEquals("Title", cd.getTitle());
	        assertEquals("Author", cd.getAuthor());
	    }

	    @Test
	    public void testCreateNewsletter() {
	        Newsletter newsletter = ItemFactory.createNewsLetter("Title", "Author");
	        assertEquals("Title", newsletter.getTitle());
	        assertEquals("Author", newsletter.getAuthor());
	    }

	    @Test
	    void userMangment() {
	    	assertTrue(mange.readUsers("email", "password"));
	    	assertFalse(mange.readUsers("wrong", "wrong"));
	    	
	    	assertEquals("student", mange.getType("email"));
	    	assertNull(mange.getType("dd"));
	    	
	    	
	    	  String testName = "John Doe";
	          String testPassword = "password123";
	          String testEmail = "johndoe@example.com";
	          String testType = "Student";
	          
	          Client testClient = mange.writeUser(testName, testPassword, testEmail, testType);
	          assertNotNull(testClient);
	         assertNull(mange.writeUser(testName, testPassword, "email", testType));
	    
	         
	         Client newClient = mange.writeUser(testName, testPassword, "unique", "Faculty");
	         assertNotNull(newClient);
	         newClient = mange.writeUser(testName, testPassword, "unique2", "Visitor");
	         assertNotNull(newClient);
	    }
	    
	    @Test 
	    void testGetCoursesEmpty() {
	    	Faculty testFaculty = new Faculty("testFaculty1", "testFaculty1@yorku.ca", "password123");
	    	ArrayList<String> courses = testFaculty.getCourses();
	    	
	    	assertTrue(courses.size() == 0);
	    }
	    
	    @Test
	    void testPopularizer(){
	    	LibraryFacade lib = new LibraryFacade("src\\team_001\\Inventorytest.txt", "src\\team_001\\booksOwedtest.txt");
	    	
	    	Faculty f = new Faculty("admin", "admin", "password123");
	    	ArrayList<String> list = new ArrayList<String>();
	    	list.add("Take Care");
	    	lib.populizer("admin", list);
	    }
	    
	    @Test
	    void testBookkeeping(){
	    	LibraryFacade lib = new LibraryFacade("src\\team_001\\Inventorytest.txt", "src\\team_001\\booksOwedtest.txt");
	    	
	    	Faculty f = new Faculty("admin", "admin", "password123");
	    	ArrayList<String> list = new ArrayList<String>();
	    	list.add("Take Care");
	    	lib.bookKeeping("admin", list);
	    }
	    
	    @Test 
	    void testGetCourses() {
	    	Faculty testFaculty = new Faculty("testFaculty2", "testFaculty2@yorku.ca", "password123");
	    	ArrayList<String> courses = testFaculty.getCourses();
	    	
	    	assertTrue(courses.size() > 0);
	    }
	    
	    @Test
	    void testBorrow(){
	    	LibraryFacade lib = new LibraryFacade("src\\team_001\\Inventorytest.txt", "src\\team_001\\booksOwedtest.txt");
	    	
	    	Client c = new Faculty("user", "user@yorku.ca", "password123");
	    	
	    	//CD;Take Care;Drake;577
	    	HashMap<Integer, Item> inv = lib.getInventory();
	    	Collection items = inv.values();
	    	Item i = (Item) items.iterator().next();
	    	assertTrue(lib.borrowItem(c, i));
	    }
	    
	    @Test
	    void testReturn(){
	    	LibraryFacade lib = new LibraryFacade("src\\team_001\\Inventorytest.txt", "src\\team_001\\booksOwedtest.txt");
	    	
	    	Client c = new Faculty("user", "user@yorku.ca", "password123");
	    	
	    	//CD;Take Care;Drake;577
	    	HashMap<Integer, Item> inv = lib.getInventory();
	    	Collection items = inv.values();
	    	Item i = (Item) items.iterator().next();
	    	
	    	library = lib.getLibrary();
	    	
	    	int initialCopies = library.copiesAvailable.get(i.ID);
	    	
	    	lib.returnItem(c, i);
	    	
	    	int finalCopies = library.copiesAvailable.get(i.ID);
	    	
	    	assertEquals(initialCopies + 1, finalCopies);
	    }
	    

	    
	    
	    
	    
}

