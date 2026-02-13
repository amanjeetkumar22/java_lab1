package Method;

class meth{
    static void hello2(){
        System.out.println("hello2");
    }
}

public class Method1 {
    public static void main(String[] args) {
        meth obj = new meth();
        obj.hello2();
    }
}
