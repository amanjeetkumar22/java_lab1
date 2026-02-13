package test.test1;

public class Exception {
    public static void main(String[] args) {
        int a=10,b=0,c;
//        c=a/b;
//           System.out.println(c);
        try{
            c=a/b;
           System.out.println(c);
         }
        catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
