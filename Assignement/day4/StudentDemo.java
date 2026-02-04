package Assignement.day4;
/* Illustrate the usage of abstract class with following Java classes –
l An abstract class ‘student’ with two data members roll no,
reg no, a method getinput() and an abstract method course()
A subclass ‘kiitian’ with course() method implementation
Write the driver class to print the all details of a kiitian object.
Input - Rollno - 2205180
Registration no - 1234567890
Output -Rollno - 2205180
Registration no - 1234567890
Course - B.Tech. (Computer Science & Engg)*/
import java.util.Scanner;

// Abstract class
abstract class Student {
    int rollno;
    long regno;

    // Method to take input
    void getinput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll No: ");
        rollno = sc.nextInt();

        System.out.print("Enter Registration No: ");
        regno = sc.nextLong();
    }

    // Abstract method
    abstract void course();
}

// Subclass
class Kiitian extends Student {

    // Implement abstract method
    void course() {
        System.out.println("Course - B.Tech. (Computer Science & Engg)");
    }

    // Method to display details
    void display() {
        System.out.println("Rollno - " + rollno);
        System.out.println("Registration no - " + regno);
        course();
    }
}

// Driver class
public class StudentDemo {
    public static void main(String[] args) {

        Kiitian k = new Kiitian();
        k.getinput();
        k.display();
    }
}
