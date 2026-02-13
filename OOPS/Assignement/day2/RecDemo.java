package Assignement.day2;
/*Create a class named 'Rectangle' with two data members
'length' and 'breadth' and two methods to print the area and
perimeter of the rectangle respectively.Its constructor having
parameters for length and breadth is used to initialize length
and breadth of the rectangle :Input:   Mention length and breadth
Output: Display Area of Rectangle and Perimeter of rectangle.*/


import java.util.Scanner;

// Blueprint class
class Rectangle1 {

    int length;
    int breadth;

    // Parameterized constructor
    Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and display area
    void printArea() {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    // Method to calculate and display perimeter
    void printPerimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

// Driver class
public class RecDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth: ");
        int breadth = sc.nextInt();

        // Create object using parameterized constructor
        Rectangle1 r = new Rectangle1(length, breadth);

        // Call methods
        r.printArea();
        r.printPerimeter();
    }
}
