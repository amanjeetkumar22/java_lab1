package OOPS.Exception;

public class Try {
    public static void main(String[] args) {
        int a=10;
        int b=10;
//        int c=a/b;
//        System.out.println(c);// ArithmeticException
     try{
         int c = a/b;
         System.out.println(c);
     }
     catch(Exception e){
         System.out.println("something went wrong");
         System.out.println(e.getMessage());
         System.out.println(e);
     }

    }
}
