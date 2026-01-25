package Method;

import java.util.Scanner;
    public class method{

//        static int logic(int x,int y){ // if you are using static then you dont need to make object

             int logic1(int x,int y){
            int z;
            z=x+y;
            return z;
        }
        static void change(int [] marks){
            marks[2]=98;
        }
        public static void main(String[]args){
            Scanner num = new Scanner(System.in);
             method alpha = new method();//making new object  if u dont use static then u need to create a object
            System.out.print("Enter number 1:");
            int a= num.nextInt();
            System.out.print("Enter number 2:");
            int b= num.nextInt();
            int c;
//            c=logic1(a,b);//without using new object
             c=alpha.logic1(a,b);

            System.out.println("Sum is " + c);

            //In array the number can be changed but not in simple numbers
            int [] array = {23,34,45,67,78};
            change(array);
            System.out.println(array[2]);

            System.out.println();

            // predefined method

            method obj1 = new method();
            System.out.println(obj1.hashCode()); // Predefined method
        }
    }
