package OOPS.Exception;
import java.util.Scanner;
class  NegativeException extends Exception {
    public String toString(){
        return "negative number cant't be used.";
    }
    public String getMessage(){
        return "negative number";
    }
}
public class Throws {
    public static double  area(int  r) throws NegativeException {
        if (r < 0){
            throw new NegativeException();
        }
         double ar= Math.PI *r*r;
        return ar;
    }
    public static int divide(int a ,int b) throws ArithmeticException {
        int res=a/b;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        System.out.print("Enter 1st number:");
//        int a= sc.nextInt();
//        System.out.print("Enter 2nd number:");
//        int b= sc.nextInt();
//        try{
//            int c = divide(a,b);
//            System.out.println("Result: " +c);
//        }
//        catch(Exception e){
//            System.out.println("Error");
//        }

        try {
            double ar = area(6);
            System.out.println("Area is "+ar);
        }
        catch (Exception e){
            System.out.print("kya yaar sahi se likho n:-");
        }
    }
}
