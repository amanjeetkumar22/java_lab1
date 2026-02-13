package Activity.calculator;

import java.util.Scanner;

class CalculatorD {

    void add(int a, int b) {
        System.out.println("Sum = " + (a + b));
    }

    void subtract(int a, int b) {
        System.out.println("Difference = " + (a - b));
    }

    void multiply(int a, int b) {
        System.out.println("Product = " + (a * b));
    }

    void divide(int a, int b) {
        if (b != 0) {
            System.out.println("Quotient = " + (a / b));
        } else {
            System.out.println("Division by zero is not allowed");
        }
    }
}

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CalculatorD c = new CalculatorD();

        System.out.println("----- Calculator Menu -----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        switch (choice) {
            case 1:
                c.add(a, b);
                break;

            case 2:
                c.subtract(a, b);
                break;

            case 3:
                c.multiply(a, b);
                break;

            case 4:
                c.divide(a, b);
                break;

            default:
                System.out.println("Invalid choice");
        }
    }
}
