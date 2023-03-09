import java.util.*;

public class SortHashMapByKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of entries they want to add
        System.out.print("How many entries do you want to add to the HashMap? ");
        int numEntries = scanner.nextInt();

        // Create an empty HashMap to store the entries
        Map<Integer, String> unsortedMap = new HashMap<>();

        // Loop through and add each entry to the HashMap
        for (int i = 1; i <= numEntries; i++) {
            System.out.print("Enter key for entry " + i + ": ");
            int key = scanner.nextInt();

            System.out.print("Enter value for entry " + i + ": ");
            String value = scanner.next();

            unsortedMap.put(key, value);
        }

        // Display the unsorted HashMap
        System.out.println("Unsorted HashMap: " + unsortedMap);

        // Sort the HashMap by keys
        Map<Integer, String> sortedMap = new TreeMap<>(unsortedMap);

        // Display the sorted HashMap
        System.out.println("Sorted HashMap: " + sortedMap);
    }
}
/*
import java.util.*;

public class SortHashMapByKeys {
    public static void main(String[] args) {
        // Create a HashMap with some entries
        Map<Integer, String> unsortedMap = new HashMap<>();
        unsortedMap.put(3, "Dog");
        unsortedMap.put(1, "Cat");
        unsortedMap.put(4, "Fish");
        unsortedMap.put(2, "Bird");

        // Display the unsorted HashMap
        System.out.println("Unsorted HashMap: " + unsortedMap);

        // Sort the HashMap by keys
        Map<Integer, String> sortedMap = new TreeMap<>(unsortedMap);

        // Display the sorted HashMap
        System.out.println("Sorted HashMap: " + sortedMap);
    }
}

 */