package Assignement.day1;
/*Write a program to print the corresponding grade for the given mark using if..else statement in Java
Input:  Mention the grade in the program
Output: Display the Grade either O/E/A/B/C
*/
import java.util.Scanner;
public class Grading {
    void Report(float x){
        if(x>=90 && x<=100){
            System.out.print("Grade: O");
        }
        else if(x>=80 && x<90){
            System.out.print("Grade: A");
        }
        else if(x>=70 && x<80){
            System.out.print("Grade: B");
        }
        else if(x>=60 && x<70){
            System.out.print("Grade: C");
        }
        else {
            System.out.print("Fail");
        }
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Marks:");
        float x = sc.nextFloat();
        Grading g = new Grading();
        g.Report(x);
    }
}
