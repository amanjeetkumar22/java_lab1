package Inheritence;
class employ{
    int salary;

    public int getsalary(){
        return salary;
    }

    String name;

    public String getname(){
        return name;
    }

    public void changename(String n){
        name=n;
    }

}

public class Practise_Question{
    public static void main(String[] args) {
        employ aman = new employ();
        aman.salary=1234;
        // aman.name="Amanjeet";
        aman.changename("Aman");
        System.out.println(aman.getsalary());
        System.out.println(aman.getname());
        System.out.println();
    }
}