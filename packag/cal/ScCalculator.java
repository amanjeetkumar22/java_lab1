package packag.cal;

public class ScCalculator extends Calculator {
    public ScCalculator(){
      subtraction();
    }
    void  subtraction() {
        int subt = a - b;
        System.out.println("Substraction :" +subt);
    }
    public static void main(String[] args) {
        ScCalculator sc = new ScCalculator();
//        sc.input();
//        sc.addition();
//        sc.subtraction();

        }
}
