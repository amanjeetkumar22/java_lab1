package Multithreading;

import java.sql.SQLOutput;

class Multithreading extends Thread {
   public  void run () { while (true){
        System.out.println("hello");
        }
    }
 }

class Multithreading2 extends Thread {
   public void run(){ while(true) {
       System.out.println("hello2");
        }
   }
}

public class ThreadDemo {
    public static void main (String[] args){
        Multithreading m1=new Multithreading();
        Multithreading m2=new Multithreading();
        m1.start();
        m2.start();
    }
}
