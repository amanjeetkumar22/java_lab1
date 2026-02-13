package Assignement.day1;
/*-Write a program to print your name, roll no, section and branch in separate lines.
Input:   Mention Name,Roll no,Section and branch
Output:  Display Name
     Display Roll No
    Display Section
    Display Branch*/
import java.util.Scanner;

public class Detail {
    void  Print(String n,int r,String s,String b){
        System.out.println("Name: "+n);
        System.out.println("Roll no: "+r);
        System.out.println("Section: "+s);
        System.out.println("Branch: "+b);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name:");
        String n = input.nextLine();
        System.out.print("Enter Your Roll No:");
        int r = input.nextInt();
        System.out.print("Enter Your Section:");
        String s = input.nextLine();
        System.out.print("Enter Your Branch:");
        String b = input.nextLine();

        Detail detail = new Detail();
        detail.Print(n,r,s,b);
    }
}
