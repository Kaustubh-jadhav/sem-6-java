import java.util.Scanner;
import java.util.TreeSet;

public class ColorTreeSet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> colors = new TreeSet<>();

        System.out.print("Enter the number of colors: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter color: ");
            String color = scanner.next();
            colors.add(color);
        }

        System.out.println("Colors in the TreeSet:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}
/*
import java.util.TreeSet;

public class ColorTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors = new TreeSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Colors in the TreeSet:");
        for (String color : colors) {
            System.out.println(color);
        }
    }
}

 */