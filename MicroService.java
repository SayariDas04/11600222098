import java.util.Scanner;

public class MicroService {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int max_a = 0, max_b = 0;
            System.out.println("Enter the number of houses: ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter the amounts of the houses: ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("The values of the array: ");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            for (int i = 0; i < n; i += 2) {
                max_a += arr[i];
            }
            for (int i = 1; i < n; i += 2) {
                max_b += arr[i];
            }
            if (max_a > max_b) {
                System.out.println("The maximum loot is: " + max_a);
            } else {
                System.out.println("The maximum loot is: " + max_b);
            }
            System.out.println("After updating the array elements: ");
            arr[0] = max_a;
            arr[1] = max_b;
            System.out.println(arr[0] + " " + arr[1]);
        }
    }
}