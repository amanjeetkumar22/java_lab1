package Assignement.day3;
/* Illustrate the execution of constructors in multi-level
inheritance with three Java classes – plate(length, width),
box(length, width, height), wood box (length, width, height,
thick) where box inherits from plate and woodbox inherits from
box class. Each class has constructor where dimensions are taken
from user.::Input: Enter the dimensions
Output: Display the dimensions accordingly*/

import java.util.Scanner;
class Plate{
    double l;
    double w;
    Plate(double l,double w){
        this.l=l;
        this.w=w;
    }

}
class Box extends Plate{
    double h;
    Box(double l,double w,double h){
        super(l,w);
        this.h=h;
    }
}
class Woodbox extends Box{
    double th;

    Woodbox(double l,double w,double h,double th){
        super(l,w,h);
        this.th=th;
    }
    void display(){
//        System.out.println(super.l+" "+super.w);
        System.out.println("lenght is:"+l);
        System.out.println("width is:"+w);
        System.out.println("Height is:"+th);
        System.out.println("Thickness is:"+th);
//        System.out.println(super.h);
    }
}
public class ConstructorDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of plate:");
        double l=sc.nextDouble();
        System.out.print("Enter the width of plate:");
        double w=sc.nextDouble();
        System.out.print("Enter the height of Box:");
        double h=sc.nextDouble();
        System.out.print("Enter the thickness of Woodbox:");
        double th=sc.nextDouble();
        Woodbox wb=new Woodbox(l,w,h,th);
        wb.display();

    }
}
