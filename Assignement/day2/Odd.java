package Assignement.day2;
/*Accept 10 numbers from command line and check
how many of them are even and how many are odd.
Input: Enter 10 number from keyboard
Output:  Display number of even and odd number*/

import java.util.Scanner;
class Check{
    int oddcount=0;
    int evencount=0;

    void Count(int []number){
       for(int num:number){
           if(num%2==0){
               evencount++;
           }
           else{
               oddcount++;
           }
       }
    }
    void Print(){
        System.out.println("Number of odd numbers: " +oddcount);
        System.out.println("Number of even numbers: "+evencount);
    }

}

public class Odd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter input size:");
        int numb=input.nextInt();
        int [] array;
        array= new int [numb];
        System.out.println("Enter numbers:");
        for(int i=0;i<numb;i++){
            array[i]=input.nextInt();
        }
        Check ch=new Check();
        ch.Count(array);
        ch.Print();

    }
}
