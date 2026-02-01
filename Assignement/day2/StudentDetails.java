package Assignement.day2;
/* Write a program in java to input and
display the details of n number of students
having roll, name and cgpa as data members.
Also display the name of the student having lowest cgpa.
Input:   Enter Roll No, Name and cgpa of ‘n’ number of students.
Output: Display the details of ‘n’ number of students. Also display
the name of student with lowest cgpa*/

import java.util.Scanner;
class Student1{
    int roll;
    String name;
    float cgpa;
    Student1(int roll,String name,float cgpa){
        this.roll=roll;
        this.name=name;
        this.cgpa=cgpa;
    }
    void display(){
        System.out.println("Student rollno is "+roll);
        System.out.println("Student name is "+name);
        System.out.println("Student cgpa is "+cgpa);
    }

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
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of students:");
        int n=sc.nextInt();
        Student1[] newe=new Student1[n];
        for (int i=0;i<n;i++) {
            System.out.print("Enter Roll:");
            int roll = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name:");
            String name = sc.next();
            System.out.print("Enter CGPA:");
            float cgpa = sc.nextFloat();
            newe[i]=new Student1(roll,name,cgpa);
        }
        System.out.println("---Student details---");
        for (Student1 s:newe ) {
            s.display();
        }

        Student1 low = Student1.lowestCGPA(newe);
        System.out.println("Student with lowest CGPA: " + low.name);

    }
}
