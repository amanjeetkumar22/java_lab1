package loop.pattern;
import java.util.*;

public class ZigZag {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();

        int[][] arr = new int[r][c];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        System.out.println("ZigZag Traversal:");

        for (int i = 0; i < r; i++) {

            if (i % 2 == 0) {
                for (int j = 0; j < c; j++)
                    System.out.print(arr[i][j] + " ");
            } else {
                for (int j = c - 1; j >= 0; j--)
                    System.out.print(arr[i][j] + " ");
            }
        }

        sc.close();
    }
}