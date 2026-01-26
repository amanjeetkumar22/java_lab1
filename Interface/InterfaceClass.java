package Interface;

interface bycycle{
    // these are property in interface .
    void applybreak(int decrement);
    void speedup(int incriment);

    // u cant modify in property from main class .
}

class herocycle implements bycycle{
    void horn(){
        System.out.println("pee pee");
    }
    public  void applybreak(int decrement){
        System.out.println("Applying brake:");
    }

    public  void speedup(int decrement){
        System.out.println("Speed up.");
    }
}

public class InterfaceClass{
    public static void main(String[] args) {
        herocycle car = new herocycle();
        car.applybreak(1);
        car.speedup(2);
        car.horn();
    }
}