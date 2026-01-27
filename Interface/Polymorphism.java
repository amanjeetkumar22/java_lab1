package Interface;

interface camera2{ // inheritence used in interface
    void takesnap();
    void recordvideo();

    private void greet(){
        System.out.println("Good Morning Sir:");
    }
    default void recordvideo4k(){
        greet();
        System.out.println("recordvideo4kfirst");
    }
}
interface wifi2{
    String[] getnetwork();
    void connecttonetwork( String network);
}

class cellphone2{
    void callnumber(int phonenumber){
        System.out.println("Calling number: "+phonenumber);
    }
    void pickcall(int phonenumber){
        System.out.println("Connecting: ");
    }

}

class smartphone2 extends cellphone2 implements wifi2,camera2{
    public void takepic(){
        System.out.println("Taking pic :");
    }
    public void takesnap(){
        System.out.println("Taking snap");
    }
    public void recordvideo(){
        System.out.println("Recording video");
    }
    public void welcome(){
        System.out.println("Greeting");
    }
    //    public void recordvideo4k(){
//        System.out.println("Recording video 4k");
//    }
    public String[] getnetwork(){
        System.out.println("Getting network");
        String[] networklist ={"Aman","Bichwa","tanu"};
        return networklist;
    }
    public void connecttonetwork(String network){
        System.out.println("Connecting to: "+network);
    }

}


public class Polymorphism{
    public static void main(String[] args) {

        camera2 cm1 = new smartphone2();//polymorphism

//        cm1.getnetwork();//---> not allowed
//        cm1.welcome();//---> not allowed
        cm1.takesnap();
        cm1.recordvideo();



    }

}
