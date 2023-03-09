import java.io.*;
import java.util.*;

public class PhoneBook {
    public static void main(String[] args) {
        // Create a hash table to store the phone book entries
        Map<String, String> phoneBook = new HashMap<>();

        // Load the phone book entries from a text file
        try {
            File file = new File("phonebook.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] fields = line.split("\t");

                String name = fields[0];
                String phone = fields[1];

                phoneBook.put(name, phone);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Phone book file not found.");
            return;
        }

        // Prompt the user to search for a name or phone number
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name or phone number to search for: ");
        String query = scanner.next();

        // Search the phone book for the query
        String result = phoneBook.get(query);

        // Display the corresponding phone number or name
        if (result != null) {
            if (result.equals(query)) {
                System.out.println("Phone number: " + result);
            } else {
                System.out.println("Name: " + result);
            }
        } else {
            System.out.println("No matching record found.");
        }
    }
}
