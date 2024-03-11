import java.util.HashMap;

public class Newsletter extends Item implements Virtual{
    public Newsletter(String title, int ID, String author, Boolean physical){
        this.title = title;
        this.ID = ID;
        this.author = author;
        this.physical = physical;
    }

    @Override
    boolean borrow() {
        return use();
    }

    @Override
    void returnItem() {
        return;
    }

    @Override
    public boolean use(Client client) {
        HashMap<Item, String> subs = client.getSubscribed();
        for (Item key : subs.keySet()) {
            if (this == key) {
                return true;
            }
        }
        return false;
    }
}
