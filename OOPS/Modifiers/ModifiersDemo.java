package Modifiers;
class c1{
    public int a=2; // access by class package subclass world
    protected int y=3;// not access by world
    int x=4;// only class or package
    private int z=5;//only class
    public void meth1(){
        System.out.println(a);
        System.out.println(y);
        System.out.println(z);
        System.out.println(x);
    }
}

public class ModifiersDemo {
    public static void main(String[] args) {
        c1 m=new c1();
//        m.meth1();
        System.out.println(m.a);
        System.out.println(m.y);
        System.out.println(m.x);
//        System.out.println(m.z); shoeing error because z is private

    }
}
