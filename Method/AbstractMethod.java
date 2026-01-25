package Method;

//abstract class  abst{
//   abstract void check(String name);
//        }
//class output extends abst{  //Abstract class is a blueprint

class output {
    void check(String name){
        System.out.println(name);
    }
}
public class AbstractMethod {
  public static void main (String[] args) {
      output obj = new output();
      obj.check("hello Aman ");
  }
}

