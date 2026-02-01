package Assignement.day2;
/*Write a program to overload subtract method with
various parameters in a class in Java. Write the
driver class to use the different subtract methods using object.
Input: Mention various subtract method having different parameters.
Output: Subtract method will display the result accordingly*/
class Subtract{
    void subtract(int a,int b){
        System.out.println("Result: "+ (a-b));
    }
    void subtract(int a,int b,int c){
        System.out.println("Result: "+ (a-b-c));
    }
    void subtract(int a,int b,int c,int d){
        System.out.println("Result: "+ (a-b-c-d));
    }
}
public class SubtractDemo {
    public static void main(String[] args) {
        Subtract sub = new Subtract();
        sub.subtract(4,2);
        sub.subtract(9,2,3);
        sub.subtract(10,2,3,1);
    }

}
