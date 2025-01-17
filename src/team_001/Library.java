package team_001;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Library{
	private static Library library = null;
    public HashMap<Integer, Item> inventory;
    public HashMap<Integer, Integer> copiesAvailable;
    private String csvFilePath;
    private String booksOwned;

    public Library(String csvFilePath, String booksOwned) {
        this.inventory = new HashMap<>();
        this.copiesAvailable = new HashMap<>();
        this.csvFilePath = csvFilePath;
        this.booksOwned = booksOwned;
        loadInventoryFromCSV();
    }
    
    public static Library getInstance(String csvFilePath, String booksOwned) {
    	if(Library.library == null) {
    		Library.library = new Library(csvFilePath, booksOwned);
    	}
    
    	return Library.library;	
    }
    
    public void returnItem(Client client, Item item) {
        int id = item.getID();
        if (copiesAvailable.containsKey(id)) {
            copiesAvailable.put(id, copiesAvailable.get(id) + 1);
            this.updateCopiesAvailable(item.author, item.title, 1);
        }
    }
    public boolean borrowItem(Client client, Item item) {
        int id = item.getID();
        System.out.println(item.getID() + " ID");
        System.out.println("Inside borow Item " + copiesAvailable.get(id));
        if (copiesAvailable.containsKey(id) && copiesAvailable.get(id) > 0) {
            copiesAvailable.put(id, copiesAvailable.get(id) - 1);
            this.updateCopiesAvailable(item.author, item.title, -1);
            return true;
        } else {
            return false;
        }
    }


    

    private void loadInventoryFromCSV() {
        try (BufferedReader reader = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String title = parts[1];
                String author = parts[2];
                int copies = Integer.parseInt(parts[3]);
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
    public void populizer(String currUser, ArrayList<String> currUserItems) {
    	try (BufferedReader reader = new BufferedReader(new FileReader(this.booksOwned))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String user = parts[0];
                String[] books = parts[1].split(",");
                if(currUser.equals(user)) {
                	for(String s: books) {
                		currUserItems.add(s);
                	}
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public void bookKeeping(String name, ArrayList<String> list) {
    	String filePath = this.booksOwned; // Update with your file path

        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            StringBuilder fileContent = new StringBuilder();
            String line;
            boolean userFound = false;

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                System.out.println("Storing " + line);
                if (parts.length >= 2 && parts[0].equals(name)) {
                    fileContent.append(name).append(";");
                    for (String book : list) {
                        fileContent.append(book).append(",");
                    }
                    fileContent.deleteCharAt(fileContent.length() - 1); // Remove extra comma
                    fileContent.append("\n");
                    userFound = true;
                } else {
                    fileContent.append(line).append("\n");
                }
            }
            reader.close();

            if (!userFound) {
                // If user not found, add new entry
                fileContent.append(name).append(";");
                for (String book : list) {
                    fileContent.append(book).append(",");
                }
                fileContent.deleteCharAt(fileContent.length() - 1); // Remove extra comma
                fileContent.append("\n");
            }

            // Write updated data back to the file
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));
            writer.write(fileContent.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    	


    
    public void updateCopiesAvailable(String author, String title, int change) {
      
    	
        File inputFile = new File(this.csvFilePath);
        File tempFile = new File("src\\team_001\\temp.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                String lineAuthor = parts[2];  
                String lineTitle = parts[1];  
                if (lineAuthor.equals(author) && lineTitle.equals(title)) {
                	System.out.println("inside update copies if");
                    int copies = Integer.parseInt(parts[3]) + change;
                    parts[3] = String.valueOf(copies);
                    
                }
                line = String.join(";", parts);
                writer.write(line + System.lineSeparator());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(tempFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(inputFile))) {

               String line;
               while ((line = reader.readLine()) != null) {
                   String[] parts = line.split(";");
                   String lineAuthor = parts[2];  
                   String lineTitle = parts[1];
                   int copies = Integer.parseInt(parts[3]);
                   parts[3] = String.valueOf(copies);
                   line = String.join(";", parts);
                   writer.write(line + System.lineSeparator());
               }
           } catch (IOException e) {
               e.printStackTrace();
           }
      
    }

}