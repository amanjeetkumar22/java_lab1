package basic;

import java.util.Scanner;
public class ArrayReverse {

    public class Reversing {
        public static void main(String[]args){
            Scanner sc=new Scanner(System.in);
//            System.out.printf("Enter the size:");
            System.out.print("Enter the size:");
            int n = sc.nextInt();
            int []num = new int[n] ;
            for (int i=0;i<n;i++){
                System.out.print("Enter the " + (i+1)+ "number :");
                num[i]=sc.nextInt();
            }
            for(int el:num){
                System.out.println(el);
            }
        }

    }

}
