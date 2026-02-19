package OOPS.Exception;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
//        return super.toString()+"_I am String.";
        return "_I am String.";
    }

    public String getMessage(){
//        return super.getMessage()+"_I am message.";
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
                throw new MyException();
            }
            catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            System.out.println(e);
            e.printStackTrace();
                System.out.println("Success");
            }
        }
    }
}
