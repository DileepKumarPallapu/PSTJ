import java.util.Scanner;

public class ArrayAccess {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the index: ");
        int index = sc.nextInt();

        if (index >= 0 && index < numbers.length) {
            System.out.println("Element at index " + index + " is: " + numbers[index]);
        } else {
            System.out.println("Invalid index!");
        }

        sc.close();
    }
}