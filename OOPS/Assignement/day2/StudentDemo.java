package Assignement.day2;
import java.util.Scanner;
class Student {

    int rollno;
    String name;
    Student(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }


    void getStudentDetails(){
        System.out.println("Student's rollno is "+rollno);
        System.out.println("Student's name is "+name);

    }
}
class StudentDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the roll no:");
        int rollno = sc.nextInt();
        sc.nextLine(); // clear the buffer
        System.out.print("Enter the name:");
        String name = sc.nextLine();

        Student st = new Student(rollno,name);
        st.getStudentDetails();

    }
}