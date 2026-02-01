package Assignement.day2;
/* Write a program in Java to create a class Rectangle
 having data members length and breadth and three methods
 called read, calculate and display to read the values of
 length and breadth,  calculate the area and perimeter of the
 rectangle and display the result   respectively.
 Input:   Mention length and breadth
Output: Display Area of Rectangle and Perimeter of rectangle.*/

import java.util.Scanner;
class Rectangle2 {
    int length;
    int breadth;
    int area;
    int perimeter;

    // Method to read values
    void read() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        length = sc.nextInt();

        System.out.print("Enter breadth: ");
        breadth = sc.nextInt();
    }

    // Method to calculate area and perimeter
    void calculate() {
        area = length * breadth;
        perimeter = 2 * (length + breadth);
    }

    // Method to display results
    void display() {
        System.out.println("Area of Rectangle: " + area);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
}

// Driver class
public class RectAreaDemo {

    public static void main(String[] args) {

        Rectangle2 r = new Rectangle2();

        r.read();
        r.calculate();
        r.display();
    }
}
