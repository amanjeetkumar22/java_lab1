package OOPS.Multithreading;
class Method extends Thread {
    public  void run () {
        int i=0;
        while (i<10){
            System.out.println("hello Aman");
            try{
                Thread.sleep(455);
            }
            catch (InterruptedException e){
                System.out.println(e);
            }
            i++;
        }
    }
}
class Method2 extends Thread {
    public  void run () {
        int i=0;
        while (i<10){
            System.out.println("hello Amanjeet Kumar");
            i++;
        }
    }
}

public class JoinMethodThread {
    public static void main(String[] args) {
        Method m1 = new Method();
        Method2 m2 = new Method2();
        m2.start();
        try{
            m2.join();
        }
        catch (InterruptedException e){
            System.out.println(e);
        }
        m1.start();
        System.out.println("Priority m1: " + m1.getState());
    }
}
