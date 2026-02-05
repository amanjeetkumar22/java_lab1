package Assignement.day5;
import java.util.Scanner;

// Interface
interface Salary {
    void earnings();
    void deductions();
    void bonus();
}

// Abstract class Manager
abstract class Manager1 implements Salary {

    double basic;

    Manager1(double basic) {
        this.basic = basic;
    }

    // Earnings calculation
    public void earnings() {
        double da = 0.80 * basic;
        double hra = 0.15 * basic;
        double totalEarnings = basic + da + hra;
        System.out.println("Earnings - " + totalEarnings);
    }

    // Deduction calculation
    public void deductions() {
        double pf = 0.12 * basic;
        System.out.println("Deduction - " + pf);
    }

    // bonus() not implemented here
}

// Substaff class
class Substaff extends Manager1 {

    Substaff(double basic) {
        super(basic);
    }

    // Bonus implementation
    public void bonus() {
        double bonus = 0.50 * basic;
        System.out.println("Bonus - " + bonus);
    }
}

// Driver class
public class SalaryDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary - ");
        double basic = sc.nextDouble();

        Substaff s = new Substaff(basic);

        s.earnings();
        s.deductions();
        s.bonus();
    }
}
