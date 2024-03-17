package team_001;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Library {
	private static Library library = null;
    public HashMap<Integer, Item> inventory;
    HashMap<Integer, Integer> copiesAvailable;
    private String csvFilePath;

    Library(String csvFilePath) {
        this.inventory = new HashMap<>();
        this.copiesAvailable = new HashMap<>();
        this.csvFilePath = csvFilePath;
        loadInventoryFromCSV();
    }
    
    public static Library getInstance(String csvFilePath) {
    	if(Library.library == null) {
    		Library.library = new Library(csvFilePath);
    	}
    
    	return Library.library;	
    }

    public void borrowItem(Client client, Item item) {
        int id = item.getID();
//        System.out.println(copiesAvailable.size());
        System.out.println(copiesAvailable.containsKey(id)+ " "+ copiesAvailable.get(id));
        if (copiesAvailable.containsKey(id) && copiesAvailable.get(id) > 0) {
        	System.out.println(copiesAvailable.size());
            copiesAvailable.put(id, copiesAvailable.get(id) - 1);
            client.borrowItem(item);
            this.updateCopiesAvailable(item.author, item.title, this.copiesAvailable.get(id));
        } else {
            System.out.println("Item is not available for borrowing.");
        }
    }


    public void returnItem(Client client, Item item) {
        int id = item.getID();
        if (copiesAvailable.containsKey(id)) {
            copiesAvailable.put(id, copiesAvailable.get(id) + 1);
            client.returnItem(item);
            this.updateCopiesAvailable(item.author, item.title, this.copiesAvailable.get(id));
        }
    }

    private void loadInventoryFromCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
       
                String[] parts = line.split(",");
                String title = parts[0];
                String author = parts[1];
                int copies = Integer.parseInt(parts[2]);

                System.out.println(title + author + copies);
                Item item = new PhysicalBook(title, author);
                inventory.put(item.ID, item);
                copiesAvailable.put(item.ID, copies);
                System.out.println(item.ID);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void updateCopiesAvailable(String author, String title, int change) {
      
    	
        File inputFile = new File(csvFilePath);
        File tempFile = new File("W:\\Yorku\\sem7\\3311\\deliverable 2\\team_001\\src\\team_001\\temp.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String lineAuthor = parts[0];  
                String lineTitle = parts[1];  
                if (lineAuthor.equals(author) && lineTitle.equals(title)) {
                    int copies = Integer.parseInt(parts[2]) + change;
                    parts[2] = String.valueOf(copies);
                    line = String.join(",", parts);
                }
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        if (!inputFile.delete() || !tempFile.renameTo(inputFile)) {
            System.err.println("Failed to update CSV file.");
        }
    }

}