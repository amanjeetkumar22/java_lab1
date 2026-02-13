package Assignement.day7;
/*Write a Java program to handle an ArithmeticException
using try, catch, and finally block.
Input: Operand values for division operation mentioned in the program
Output: ArithmeticException caught by try-catch-finally block*/
public class ArithmeticDemo {
    public static void main(String[] args) {

        int a = 10;
        int b = 0;   // division by zero

        try {
            int result = a / b;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught by try-catch-finally block");
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
