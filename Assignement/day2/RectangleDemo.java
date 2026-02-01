package Assignement.day2;
/* Write a program in java using constructor overloading
concept to calculate the area of a rectangle having data
member as length and breadth.Use default constructor to
initialize the value of the data member to zero and parameterized
constructor to initialize the value of data member according to the user input.
Input: Mention the value of length and breadth
Output: Display the area of rectangle accordingly.*/
import java.util.Scanner;

// Blueprint class
class Rectangle {

    int length;
    int breadth;

    // Default constructor
    Rectangle() {
        length = 0;
        breadth = 0;
    }

    // Parameterized constructor
    Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }

    // Method to calculate and display area
    void displayArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
}

// Driver class
public class RectangleDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Using default constructor
        Rectangle r1 = new Rectangle();
        r1.displayArea();   // area will be 0

        // User input
        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        // Using parameterized constructor
        Rectangle r2 = new Rectangle(length, breadth);
        r2.displayArea();
    }
}
