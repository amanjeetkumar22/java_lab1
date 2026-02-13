package Assignement.day4;
import java.util.Scanner;

class Student1 {
    int roll;
    String name;
    double cgpa;

    // Constructor
    Student1(int roll, String name, double cgpa) {
        this.roll = roll;
        this.name = name;
        this.cgpa = cgpa;
    }

    // Display method
    void display() {
        System.out.println("Roll No : " + roll);
        System.out.println("Name    : " + name);
        System.out.println("CGPA    : " + cgpa);
        System.out.println("----------------------");
    }

    // Static method to find lowest CGPA student
    static Student1 lowestCGPA(Student1[] s) {
        Student1 low = s[0];

        for (int i = 1; i < s.length; i++) {
            if (s[i].cgpa < low.cgpa) {
                low = s[i];
            }
        }
        return low;
    }
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        Student1[] arr = new Student1[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));
            System.out.print("Roll No: ");
            int roll = sc.nextInt();
            sc.nextLine(); // buffer clear
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("CGPA: ");
            double cgpa = sc.nextDouble();

            arr[i] = new Student1(roll, name, cgpa);
        }

        // Display all students
        System.out.println("\n--- Student Details ---");
        for (Student1 s : arr) {
            s.display();
        }

        // Lowest CGPA
        Student1 low = Student1.lowestCGPA(arr);
        System.out.println("\nStudent with Lowest CGPA:");
        low.display();
    }
}
