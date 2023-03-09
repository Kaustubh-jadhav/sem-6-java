import java.util.LinkedList;
import java.util.Scanner;

public class FriendsLinkedList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> friends = new LinkedList<>();

        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter friend's name: ");
            String friendName = scanner.next();
            friends.add(friendName);
        }

        System.out.println("Friends in the LinkedList:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
