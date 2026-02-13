package Method;

import java.util.Scanner;

public class MethodOverloading {

    //Method overloading

        static void hello(){
            System.out.println("Hello Aman:");
        }
        static void hello(int  a){
            System.out.println("Hello Aman " +a+ ":");
        }

        static void change(int [] marks){
            marks[2]=98;
        }
        public static void main(String[]args){
            Scanner num = new Scanner(System.in);

            hello();

            hello(20);//method overloading

            //In array the number can be changed but not in simple numbers
            int [] array = {23,34,45,67,78};
            array[2]=10;
            System.out.println(array[2]);
            change(array);
            System.out.println(array[2]);
        }
}

