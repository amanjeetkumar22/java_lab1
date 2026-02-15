package OOPS.Multithreading;
class Construct extends Thread{
    public Construct(String name){
        super (name);
    }
     public void run (){
        int i=0;
        while(i<10){
            System.out.println("Hello bacho:");
            i++;
        }

    }
}

public class ConstructorThread {
    public static void main(String[] args) {
        Construct c = new Construct("Aman");
        c.start();
        System.out.println(c.getId());// to print id
        System.out.println(c.getName());// print name

    }
}
