package test.test1;
class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");}
}

public class Falu {
    public static void main(String[] args) {
//        Animal d = new Dog();
//        Dog d = new Animal();
//        Animal d;
        Dog d;
        d = new Dog();
//        d.eat();//inherited method
        d.eat();
//        d = new Animal();
        d.bark();
    }
}
