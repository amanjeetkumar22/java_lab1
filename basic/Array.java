package basic;
import java.sql.SQLOutput;
import java.util.*;
public class Array{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Size:");
        int n =sc.nextInt();
        int [] num;// declaring array
        num= new int [n]; // size declaring

        // taking input
        for(int i=0;i<n;i++){
            System.out.print("Enter number " + (i+1) + ":" );
            num[i] = sc.nextInt();
        }


        // for loop
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println("using for each loop");
        for (int element:num){ // for each loop
            System.out.print(element+" ");
        }
    }
}
