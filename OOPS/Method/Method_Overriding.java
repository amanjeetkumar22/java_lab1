package Method;

class First{
    //method who is returning something
    public int  method1(){
        return 4;
    }

    //Second method
    public void meth2(){
        System.out.println("Hello");
    }

}
class Second extends First{
    public void meth2(){
        System.out.println("Hello 2nd time ");
    }

    public void meth3(){
        System.out.println("Hello 3rd");
    }
}
public class Method_Overriding{
    public static void main(String[] args){
        // First a=new First();
        // // a.meth2();

        // Second b= new Second();
        // // b.meth2();
        // b.meth3();

        First a = new Second();// using 2nd method
        a.meth2();// it access  the second
//         a.meth3();// not allowed // Dynamic method dispatch


        System.out.println(a.method1());//not allowed // Dynamic method dispatch

    }
}