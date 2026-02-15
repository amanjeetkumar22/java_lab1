package OOPS.Multithreading;
class Priority extends Thread{
    public Priority(String name){
        super (name);
    }
    public void run (){
        int i=0;
        while(i<34){
            System.out.println("Hello " + this.getName());
            i++;
        }

    }
}

public class PriorityThread {
    public static void main(String[] args) {
        Priority c2 = new Priority("AmanJeet");
        Priority c3 = new Priority("Amanjeet Kumar");
        Priority c4 = new Priority("Amanjeet Kumar Gupta");
        Priority c1 = new Priority("Aman");
        c4.setPriority(Thread.MAX_PRIORITY);
        c1.setPriority(Thread.MIN_PRIORITY);
        c1.start();
        c2.start();
        c3.start();
        c4.start();



    }
}
