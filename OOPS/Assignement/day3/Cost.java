package Assignement.day3;
/* A Plastic manufacturer sells plastic in different shapes
like 2D sheet and 3D box. The cost of sheet is Rs 40/ per square ft.
and the cost of box is Rs 60/ per cubic ft. Implement it in Java
to calculate the cost of plastic as per the dimensions given by
the user where 3D inherits from 2D.::Input: Enter  dimensions
Output:  Display the cost of plastic*/

import java.util.Scanner;

class Twod{
    double l;
    double b;
//    void Twod(double l,double b){
     Twod(double l,double b){
     this.l=l;
     this.b=b;
    }

    static double Area(double l,double b){
        double area=l*b;
        System.out.println("Area is: "+area);
         return area;
    }

    void cost(double l, double b, double h){
        double c=Area(l,b);
        System.out.println("Cost of 2d box "+ (c*40) +" rupees.");
    }

}

class Three extends Twod{
    double h;

    Three(double l,double b,double h){
        super(l,b);// calling constructor using super keyword
        this.h=h;
    }
    static double Volume(double l,double b,double h){
        double vol= Area(l,b) * h;
        System.out.println("Volume of 3D box is: "+vol);
        return vol;
    }

    void cost3d(){
        double c=Volume(l,b,h);
        System.out.println("Cost of 3d box "+ (c*60) +" rupees.");
    }

}
public class Cost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of l:");
        double l=sc.nextDouble();
        System.out.print("Enter the value of b:");
        double b=sc.nextDouble();
        System.out.print("Enter the value of h:");
        double h=sc.nextDouble();
//        Twod t = new Twod(l,b);
        Three t=new Three(l,b,h);
        t.Area(l,b);
        t.cost(l,b, h);
        System.out.println();
        t.cost3d();

    }
}
