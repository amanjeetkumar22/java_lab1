package Practise11;
abstract class Peen{
    abstract void write();
    abstract void refil();

}

class FountainPen extends Peen{
    void write(){
        System.out.println("write");
    }
    void refil(){
        System.out.println("refil");
    }
    public void changenib(){
        System.out.println("changenib");
    }
}

public class Pen {
    public static void main (String[] args) {
        FountainPen obj = new FountainPen();
        obj.changenib();
    }
}
