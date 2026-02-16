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
        c2.setPriority(3);
        c3.setPriority(5);
        c1.start();
        c2.start();
        c3.start();
        c4.start();
        System.out.println("Priority c1: " + c1.getPriority());
        System.out.println("Priority c2: " + c2.getPriority());
        System.out.println("Priority c3: " + c3.getPriority());
        System.out.println("Priority c4: " + c4.getPriority());
        System.out.println("Priority state c1: " + c1.getState());



    }
}
