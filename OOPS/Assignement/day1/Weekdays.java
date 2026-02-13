package Assignement.day1;
/*Write a program to print the week day for the given day no. of the current month using switch case statement
Input:  Mention the Day no in the program
Output: Display the week day(either Sunday/Monday/Tuesday/Wednesday /Thursday/Friday/Saturday)*/
import java.util.Scanner;
public class Weekdays {
    void Day(int d){
        if(d==1){
            System.out.println("Monday");
        }
        else if(d==2){
            System.out.println("Tuesday");
        }
        else if(d==3){
            System.out.println("Wednesday");
        }
        else if(d==4){
            System.out.println("Thursday");
        }
        else if(d==5){
            System.out.println("Friday");
        }
        else if(d==6){
            System.out.println("Saturday");
        }
        else if(d==7){
            System.out.println("Sunday");
        }
        else{
            System.out.println("Invalid day");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of weekday:");
        int n=sc.nextInt();
        Weekdays w = new Weekdays();
        w.Day(n);

    }
}
