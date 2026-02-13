package test.test1;

class Shape {

    // method in parent class
    void area() {
        System.out.println("Area not defined");
    }
}

// Child class 1
class Circle extends Shape {

    void area() {
        System.out.println("Area of Circle");
    }
}

// Child class 2
class Rectangle extends Shape {

    void area() {
        System.out.println("Area of Rectangle");
    }
}

public class Test {
    public static void main(String[] args) {

        // Parent class reference
        Shape shape;

        // Object of Circle
        shape = new Circle();
        shape.area();     // calls Circle's area()

        // Object of Rectangle
        shape = new Rectangle();
        shape.area();     // calls Rectangle's area()
    }
}
