package test.test1;
/*Accept 5 integers, find largest & smallest*/
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];

        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0], min = a[0];

        for (int i = 1; i < 5; i++) {
            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
