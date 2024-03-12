package team_001;

public abstract class Item {
    private static int lastAssignedID = 0;

    String title;
    int ID;
    String author;

    public Item(String title, String author) {
        this.title = title;
        this.author = author;
        this.ID = ++lastAssignedID;
    }

	public int getID() {
		return this.ID;
	}
}


