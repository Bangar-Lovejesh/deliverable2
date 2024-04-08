package team_001;

public abstract class Item implements Cloneable {
    private static int lastAssignedID = 1;

    String title;
    public int ID;
    String author;

    public Item(String title, String author) {
        this.title = title;
        this.author = author;
        this.ID = lastAssignedID;
        lastAssignedID++;
    }
    public String getTitle() {
    	return title;
    }
    public String getAuthor() {
    	return author;
    }

	public int getID() {
		return this.ID;
	}

    @Override
    public Object clone() throws CloneNotSupportedException {
    	return super.clone(); 	
    }
}


