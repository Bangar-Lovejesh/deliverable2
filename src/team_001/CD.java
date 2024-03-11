public class CD extends Item{
    public CD(String title, int ID, String author, Boolean physical){
        this.title = title;
        this.ID = ID;
        this.author = author;
        this.physical = physical;
    }
    @Override
    boolean borrow() {
        if (counter == 10){
            return false;
        } else {
            counter++;
            return true;
        }
    }

    @Override
    void returnItem() {
        counter--;
    }
}
