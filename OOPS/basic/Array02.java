package basic;

import java.util.Scanner;
public class Array02{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int [] nums= new int [5];
        nums = new int [5];
        nums[4]=5;
        System.out.printf("%d",nums[4]);

        //printing of sum
        float [] num={1.2f,1.3f,1.2f,1.1f,2.1f,1.1f};
        float sum=0;
        for(float element:num){
            sum=sum+element;
        }
        System.out.println(sum);


        /* float test=2.1f;
        boolean inarray=false;
        for(float element:num){

            if(element==test){
                inarray= true;
                break;
            }
            if(inarray)
            {
                System.out.println("found");
            }
            else
            System.out.println("Not found.");
        }*/

        float test=2.1f; // for checking @@@@ input

        boolean yes ;
        for(float element:num){

            if(element==test){
                yes = true;
                break;
            }

        }
        if(yes= true)
        {
            System.out.println("found");
        }
        else
            System.out.println("Not found.");
    }
}
