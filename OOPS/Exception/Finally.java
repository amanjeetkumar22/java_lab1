package OOPS.Exception;

import java.util.Scanner;
public class Finally {
    static int greet(){
        try{
            int a=10;
            int b=0;
//            int b=5;
            int c=a/b;
            System.out.println(c);
            return c;
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally Run Success");
        }
        return -1;
    }
    public static void main(String[] args) {
       int k= greet();
       System.out.println(k);
    }
}
