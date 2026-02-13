package Assignement.day3;
/*Write a class Account containing acc_no, balance
as data members and two methods as input() for taking
input from user and disp() method to display the details.
Create a subclass Person which has name and aadhar_no as extra
data members and override disp() function. Write the complete
progrm to take and print details of three persons.
Input: Enter details of three persons.
Output: Display details of three persons*/
import java.util.Scanner;

// Base class
class Accountt {
    int acc_no;
    double balance;

    // Method to take input
    void input(Scanner sc) {
        System.out.print("Enter Account Number: ");
        acc_no = sc.nextInt();

        System.out.print("Enter Balance: ");
        balance = sc.nextDouble();
    }

    // Method to display details
    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

// Subclass
class Person extends Accountt {
    String name;
    String aadhar_no;

    // Override input method
    void input(Scanner sc) {
        super.input(sc);   // call Account input

        sc.nextLine(); // clear buffer
        System.out.print("Enter Name: ");
        name = sc.nextLine();

        System.out.print("Enter Aadhar Number: ");
        aadhar_no = sc.nextLine();
    }

    // Override display method
    void disp() {
        super.disp();   // call Account disp
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

// Driver class
public class Account {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Person[] persons = new Person[3];

        // Input details
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details of person " + (i + 1));
            persons[i] = new Person();
            persons[i].input(sc);
        }

        // Display details
        System.out.println("\n--- Details of Three Persons ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nPerson " + (i + 1));
            persons[i].disp();
        }
    }
}
