package team_001;
module team_001;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class LibraryTest {

	@Test
	void test() {
		Library lib = new Library("C:\\Users\\Gurdip Kuddu\\Desktop\\team_001\\src\\team_001\\ItemDatabase.txt");
		
		Client fac = new Faculty("username", "email", "password", lib);
		ArrayList<Item> items = new ArrayList<>();
		
		for(Item item: lib.inventory.values()) {
			items.add(item);
		}

		lib.borrowItem(fac, items.get(0));
		Item item = new PhysicalBook("fff", "Fff");
		try {
			Item clonedbook = (PhysicalBook) item.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(lib.copiesAvailable.get(1));
		
	}

}
