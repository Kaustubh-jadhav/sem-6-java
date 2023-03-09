import java.util.ArrayList;
import java.util.Scanner;

public class CitiesArrayList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> cities = new ArrayList<>();

        System.out.print("Enter the number of cities: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter city name: ");
            String cityName = scanner.next();
            cities.add(cityName);
        }

        System.out.println("Cities in the ArrayList:");
        for (String city : cities) {
            System.out.println(city);
        }

        cities.clear();
        System.out.println("All cities removed from the ArrayList.");
    }
}