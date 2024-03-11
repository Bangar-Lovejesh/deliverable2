package team_001;

public abstract class Item {
    String title;
    int ID;
    String author;
    Boolean physical;
    int counter;
    abstract boolean borrow();
    abstract void returnItem();
}


