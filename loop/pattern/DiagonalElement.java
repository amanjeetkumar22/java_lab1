package loop.pattern;
import java.util.*;
public class DiagonalElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] matrix = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        System.out.println("Main Diagonal:");

        for (int i = 0; i < n; i++) {
            System.out.println(matrix[i][i]);
        }

        sc.close();
    }
}