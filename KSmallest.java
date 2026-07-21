import java.util.Arrays;
import java.util.Scanner;

public class KSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the value of K: ");
        int k = sc.nextInt();

        Arrays.sort(arr);

        System.out.println("The " + k + " smallest elements are:");
        for (int i = 0; i < k && i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}