package packag.cal;

import java.util.Scanner;

public class Calculator {
//    protected int a;
//    protected int b;
    public int a;
    public int b;
    public Calculator(){
        input();
        addition();
    }

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a number:");
        a = sc.nextInt();
        System.out.print("Please enter b number:");
        b = sc.nextInt();
    }
    void addition(){
        int  sum = a + b;
        System.out.println("Sum:"+sum);
    }
    public static void main(String[] args) {
        new Calculator();
    }
}
