package Interface;


interface camera1{ // inheritence in interface
    void takepic();
}
interface camera extends camera1{ // inheritence used in interface
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
interface wifi{
    String[] getnetwork();
    void connecttonetwork( String network);
}

class cellphone{
    void callnumber(int phonenumber){
        System.out.println("Calling number: "+phonenumber);
    }
    void pickcall(int phonenumber){
        System.out.println("Connecting: ");
    }

}

class smartphone extends cellphone implements wifi,camera{
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


public class Default {
    public static void main(String[] args) {
        System.out.println("your output is :");
        smartphone sp= new smartphone();
        sp.takepic();// inheritence
        sp.takesnap();
        sp.recordvideo();
        sp.welcome();
        sp.recordvideo4k();
        String[] ar =sp.getnetwork();
        for(String item:ar){
            System.out.println(item);
        }
    }
}
