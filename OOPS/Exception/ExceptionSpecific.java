package OOPS.Exception;
import java.util.Scanner;
public class ExceptionSpecific {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr=new int[3];
         arr[0]=78;
         arr[1]=98;
         arr[2]=99;

        System.out.print("Enter array index:");
        int ind = sc.nextInt();
        System.out.print("Enter number to divide:");
        int num = sc.nextInt();

        try{
            System.out.println("Value of array index:"+arr[ind]);
            System.out.println("Value of number to divide:"+arr[ind]/num);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("something went wrong");
            System.out.println(e);
        }
    }
}
