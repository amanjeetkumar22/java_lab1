package Multithreading;

import java.sql.SQLOutput;

class Multithreading extends Thread {
   public  void run () {
       int i=0;
       while (i<50){
        System.out.println("hello");
        i++;
        }
    }
 }

class Multithreading2 extends Thread {
   public void run(){ //run is thread method predefined
       int i=0;
       while (i<50) {
       System.out.println("hello2");
       i++;
        }
   }
}

public class ThreadDemo {
    public static void main (String[] args){
        Multithreading m1=new Multithreading();
        Multithreading2 m2=new Multithreading2();
        m1.start();
        m2.start();// start is aldo thread method to call run method

    }
}
