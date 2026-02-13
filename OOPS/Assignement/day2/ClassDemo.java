package Assignement.day2;
/*:Write a class file – box with three data
members(length, width, height) and a method
 volume() . Also implement the application class
 Demo where an object of the box class is created
with user entered dimensions and volume is printed.*/

import java.util.Scanner;
class Box{
    int lenght;
    int width;
    int height;

    void Box(int lenght,int width,int height){ // constructor
        this.lenght=lenght;
        this.width=width;
        this.height=height;
    }

    void Volume(){
        System.out.println("Volume is: "+lenght*width*height);
    }

}
public class ClassDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the length of the box:");
        int l=sc.nextInt();
        System.out.println("enter the width of the box:");
        int w=sc.nextInt();
        System.out.println("enter the height of the box:");
        int h=sc.nextInt();
        Box box=new Box();
        box.Box(l,w,h);
        box.Volume();
    }
}
