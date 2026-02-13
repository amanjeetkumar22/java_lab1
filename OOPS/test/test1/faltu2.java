package test.test1;
class Parent {
    void show() {
        System.out.println("This is Parent class");
    }
}

class Child extends Parent {
    void show() {
        System.out.println("This is Child class");
    }
}

//public class DynamicBindingDemo {
public class faltu2{
    public static void main(String[] args) {
        Parent p = new Child();  // reference of parent, object of child
        p.show();                // decided at runtime
    }
}
