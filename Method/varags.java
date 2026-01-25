package Method;

public class varags {

    static int sum (int ...ar){ // using three dot we c access main class element
        int result=0;
        for (int a:ar){
            result+=a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 5, 4));//varargs ... arr (3 dot)
    }
}
