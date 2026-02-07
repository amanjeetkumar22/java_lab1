package test.test1;
 class Shape1 {
        void draw() {
            System.out.println("Drawing shape");
        }
    }

    class Circle1 extends Shape1 {
        void draw() {
            System.out.println("Drawing Circle");
        }
    }

    class Rectangle1 extends Shape1 {
        void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    public class Poly {
        public static void main(String[] args) {

            Shape1 s;

            s = new Circle1();
            s.draw();

            s = new Rectangle1();
            s.draw();
        }
    }
