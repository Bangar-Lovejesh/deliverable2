package team_001;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class LibraryTest {

	@Test
	void test() {
		Library lib = new Library("C:\\Users\\Gurdip Kuddu\\Desktop\\team_001\\src\\team_001\\ItemDatabase.txt");
		
		Client fac = new Faculty("username", 2, "email", "password", lib);
		ArrayList<Item> items = new ArrayList<>();
		
		for(Item item: lib.inventory.values()) {
			items.add(item);
		}

		lib.borrowItem(fac, items.get(0));
		System.out.println(lib.copiesAvailable.containsKey(1) && lib.copiesAvailable.get(1) > 0);
	}

}
