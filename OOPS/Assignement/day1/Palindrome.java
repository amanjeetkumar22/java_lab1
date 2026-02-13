package Assignement.day1;
/*Program to check a user entered number is palindrome or not
Input:  Mention the number in the program
Output: display the number is Palindrome or not.*/

import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = n.nextInt();
        int original = num;
        int reverse = 0;

        while(num!=0){
           int temp= num%10;
           reverse=reverse*10 + temp;
            num=num/10;
        }
        if(original==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }

    }
}
