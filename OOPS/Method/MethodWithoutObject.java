package Method;

import java.util.Scanner;

public class MethodWithoutObject {

    static int logic(int x, int y) { // if you are using static then you dont need to make object

//         int logic(int x,int y){
        int z;
        z = x + y;
        return z;
    }

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

//         MethodWithoutObject alpha = new MethodWithoutObject();//making new object  if u dont use static then u need to create a object

        System.out.print("Enter number 1:");
        int a = num.nextInt();
        System.out.print("Enter number 2:");
        int b = num.nextInt();
        int c;
        c = logic(a, b);//without using new object

//         c=alpha.logic(a,b);

        System.out.println("Sum is " + c);
    }
}
