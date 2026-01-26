package Modifiers;

/*constructor is a special type of class with same
name of class used to initialize
object */
class Const{
    int id;
    String name;

     public Const(){
          id = 56473;
         name = "Amanjeet";
     }
}


public class Constructor {
    public static void main(String[] args) {
        Const c = new Const();
//        int d = c.id;
//        System.out.println(d);
        System.out.println(c.name);
        System.out.println(c.id);
    }
}
