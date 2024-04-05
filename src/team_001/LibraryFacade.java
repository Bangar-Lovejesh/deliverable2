package team_001;

import java.util.ArrayList;
import java.util.HashMap;

public class LibraryFacade {
    private Library library;

    public LibraryFacade(String csvFilePath, String booksOwed) {
        this.library = Library.getInstance(csvFilePath, booksOwed);
    }

    public boolean borrowItem(Client client, Item item) {
        return library.borrowItem(client, item);
    }

    public void returnItem(Client client, Item item) {
        library.returnItem(client, item);
    }

    public int checkOverdue(Client client, Item item) {
        return client.checkOverdue(item);
    }
    
    public HashMap<Integer, Item> getInventory(){
    	return library.inventory;
    }
    public void bookKeeping(String name, ArrayList<String> list) {
    	library.bookKeeping(name,list);
    }
    public void populizer(String currUser, ArrayList<String> currUserItems) {
    	library.populizer(currUser, currUserItems);
    }

}
