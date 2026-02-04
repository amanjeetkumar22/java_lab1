package Assignement.day5;
interface Motor {
    // data member (public static final by default)
    int capacity = 5;

    // abstract methods
    void run();
    void consume();
}

class WashingMachine implements Motor {

    // implementing run()
    public void run() {
        System.out.println("Motor is running");
    }

    // implementing consume()
    public void consume() {
        System.out.println("Motor is consuming electricity");
    }

    // method to display capacity
    void showCapacity() {
        System.out.println("Capacity of the motor is " + capacity);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {

        // object of implementing class
        WashingMachine wm = new WashingMachine();

        wm.run();
        wm.consume();

        // checking interface data member through object
        wm.showCapacity();
    }
}
