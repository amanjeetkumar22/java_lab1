package Method;

import java.util.Scanner;
public class Factorial{

    static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        else
            return n*fact(n-1);
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = input.nextInt();
        System.out.println(fact(n));

    }
}

