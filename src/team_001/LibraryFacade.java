package team_001;

public class LibraryFacade {
    private Library library;

    public LibraryFacade(String csvFilePath) {
        this.library = Library.getInstance(csvFilePath);
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

}
