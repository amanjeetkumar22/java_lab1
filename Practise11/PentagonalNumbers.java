package Practise11;
/*Write a Java method to display the first 50 pentagonal numbers.
Note: A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon, but, unlike the first two, the patterns involved in the construction of pentagonal numbers are not rotationally symmetrical.
Expected Output*/

public class PentagonalNumbers {

    // Method to display first 50 pentagonal numbers
    public static void displayPentagonalNumbers() {
        for (int n = 1; n <= 50; n++) {
            int pentagonal = n * (3 * n - 1) / 2;
            System.out.print(pentagonal + " ");

            // print 10 numbers per line (nice formatting)
            if (n % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        displayPentagonalNumbers();
    }
}

