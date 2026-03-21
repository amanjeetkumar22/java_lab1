package OOPS.Exception;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){ //to print exception ////Method to print Exception information
//        return super.toString()+"_I am String.";
        return "_I am String.";
    }

    public String getMessage(){ // print exception message
//        return super.getMessage()+"_I am message1."; //super -> it show the error ; here null
        return "_I am message.";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num  = input.nextInt();
        if (num<9)
        {
            try{
//                throw new MyException();
                throw new ArithmeticException("this is mistake");
            }
            catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString()); // using super we can print message and what error or eception occured
            System.out.println(e);

            e.printStackTrace();//Method to print Exception information
            System.out.println("Success");
            }
        }
    }
}
