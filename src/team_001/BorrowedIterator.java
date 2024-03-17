package team_001;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;

public class BorrowedIterator implements Iterator<Item> {
	Iterator<Item> iterator;
	
    public BorrowedIterator(HashMap<Item, LocalDate> borrowed) {
        this.iterator = borrowed.keySet().iterator();
    }

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return iterator.hasNext();
	}

	@Override
	public Item next() {
		// TODO Auto-generated method stub
		return iterator.next();
	}

}
