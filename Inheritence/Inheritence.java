package Inheritence;
class employe{

    //this is constructor
    public employe(){
        System.out.println("Hello coders ");
    }


    private int id;
    private String name;

    public void setname(String n){this.name=n;}//for input
    public String getname(){return name;}// for output
    public int getid(){return id;}
    public void setid(int i){this.id=i;}
}

class employee extends employe{
    int salary;
    public void setsalary(int n){this.salary=n;}//for input
    public int getsalary(){return salary;}//for output

    //constructor in inheritence
    public employee(){
        System.out.println("Inheritence");
    }

}

public class Inheritence{
    public static void main(String[] args) {
        // employe amu=new employe();
        employee amu=new employee();


        //Showing error because of "private access modifiers"
        // amu.id=1234;
        // amu.name="Aman";

        amu.setname("Aman");
        amu.setid(1234);
        // amu.setsalary(5000);
        System.out.println(amu.getname());
        System.out.println(amu.getid());
        // System.out.println(amu.salary);

    }
}
