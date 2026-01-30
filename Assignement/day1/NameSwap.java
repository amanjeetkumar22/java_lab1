package Assignement.day1;
/*Write a program in Java to take first
name and last name from user and print both in one
line as last name followed by first name*/
import java.util.Scanner;
public class NameSwap {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      System.out.print("Enter your first name:");
      String first=in.nextLine();
      System.out.print("Enter your second name:");
      String second=in.nextLine();
      System.out.println(second+" "+first);
    }
}
