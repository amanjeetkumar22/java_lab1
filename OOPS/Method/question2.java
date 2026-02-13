package Method;
class square{
    int side;

    public int area(){
        return side*side;
    }

    public int perimeter(){
        return 4*side;
    }

}
public class question2{
    public static void main(String[]args){
        square input = new square();
        input.side= 2;

        System.out.println(input.area());
        System.out.println(input.perimeter());

    }
}