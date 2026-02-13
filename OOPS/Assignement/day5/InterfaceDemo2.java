package Assignement.day5;
/* Define an interface Emploee with a method getDetails()
to get emplyee details as Empid and Ename. Also define a derived
interface Manager with a method getDeptDetails() to get department
details such as Deptid and Deptname.Then define a class Head which
 implements Manager interface and also prints all details of the employee.
 Write the complete program to display all details of one head of the department.
Input - Enter employee id - 123
Enter employee name - Sidharth Ambani
Enter department id - 06
Enter department name -Marketing
Output - Employee id - 123
Employee name - Sidharth Ambani
Department id - 06
Department name -Marketing*/
import java.util.Scanner;

// Base interface
interface Employee {
    void getDetails();
}

// Derived interface
interface Manager extends Employee {
    void getDeptDetails();
}

// Class implementing derived interface
class Head implements Manager {

    int empId;
    String empName;
    int deptId;
    String deptName;

    Scanner sc = new Scanner(System.in);

    // Get employee details
    public void getDetails() {
        System.out.print("Enter employee id - ");
        empId = sc.nextInt();
        sc.nextLine();   // clear buffer

        System.out.print("Enter employee name - ");
        empName = sc.nextLine();
    }

    // Get department details
    public void getDeptDetails() {
        System.out.print("Enter department id - ");
        deptId = sc.nextInt();
        sc.nextLine();   // clear buffer

        System.out.print("Enter department name - ");
        deptName = sc.nextLine();
    }

    // Display all details
    void display() {
        System.out.println("\nEmployee id - " + empId);
        System.out.println("Employee name - " + empName);
        System.out.println("Department id - " + deptId);
        System.out.println("Department name - " + deptName);
    }
}

// Driver class
public class InterfaceDemo2{
    public static void main(String[] args) {

        Head h = new Head();

        h.getDetails();        // employee details
        h.getDeptDetails();    // department details
        h.display();           // display all details
    }
}
