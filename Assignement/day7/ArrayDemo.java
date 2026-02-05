package Assignement.day7;
/* Write a Java program to generate an ArrayIndexOutofBoundsException
and handle it using catch statement.
Input: Enter the  numbers -Example: 1 2 3 4 5 ( Suppose array size is 4 )
Output: Exception in thread “main” java.lang.ArrayIndexOutOfBoundsException:4*/

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];   // array size is 4

        System.out.println("Enter 5 numbers:");

        try {
            for (int i = 0; i < 5; i++) {   // intentionally exceeding size
                arr[i] = sc.nextInt();
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
