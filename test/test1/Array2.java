package test.test1;
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input first value and difference
        System.out.print("Enter first number: ");
        int n = sc.nextInt();

        System.out.print("Enter difference: ");
        int d = sc.nextInt();

        // Create array of size 10
        int[] arr = new int[10];

        // Initialize arithmetic sequence
        arr[0] = n;
        for (int i = 1;i<10; i++) {
//            arr[i] = arr[i - 1] + diff;
            arr[i] = arr[i- 1] +d;
        }

        // Display the sequence
        System.out.println("Arithmetic Sequence:");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
