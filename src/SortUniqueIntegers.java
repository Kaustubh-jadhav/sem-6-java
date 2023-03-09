import java.util.*;

public class SortUniqueIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many integers do you want to enter? ");
        int n = scanner.nextInt();
        Set<Integer> nums = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter integer " + i + ": ");
            int num = scanner.nextInt();
            nums.add(num);
        }

        Integer[] sortedNums = nums.toArray(new Integer[0]);
        Arrays.sort(sortedNums);
        System.out.println("Sorted integers: " + Arrays.toString(sortedNums));
    }
}
