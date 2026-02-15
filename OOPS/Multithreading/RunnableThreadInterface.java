package OOPS.Multithreading;
class RunnableThread implements Runnable {
    public  void run () {
        int i=0;
        while (i<50){
            System.out.println("hello3");
            i++;
        }
    }
}
class RunnableThread2 implements Runnable {
    public  void run () {
        int i=0;
        while (i<50){
            System.out.println("hello4");
            i++;
        }
    }
}

public class RunnableThreadInterface {
    public static void main(String[] args) {
         // // to print interface m1
//        new Thread(new RunnableThread()).start();
//        new Thread(new RunnableThread2()).start();

//          // m2
//        Runnable r = new RunnableThread();
//        Thread t = new Thread(r);
//        t.start();
//        Runnable r1 = new RunnableThread2();
//        Thread t1 = new Thread(r1);
//        t1.start();

//         / / m3
        RunnableThread r = new RunnableThread();
        Runnable r1 = new RunnableThread2();
//        r.run();
//        r1.run();

//        / /m4
        Thread t1 = new Thread(r); //gun bullet method t is gun r is bullet
        Thread t2 = new Thread(r1);
        t1.start();
        t2.start();
    }
}
