package team_001;

import java.util.HashMap;

public class VirtualBook extends Item implements Virtual{
    public VirtualBook(String title, int ID, String author, Boolean physical){
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
        if (client instanceof Student) {
            HashMap<String, String> list = client.getCourseList();
            for (String val : list.values()) {
                if (this.title.equals(val)) {
                    return true;
                }
            }
            return false;
        } else {
            HashMap<Item, String> subs = client.getSubscribed();
            for (Item key : subs.keySet()) {
                if (this == key) {
                    return true;
                }
            }
            return false;
        }
    }
}
