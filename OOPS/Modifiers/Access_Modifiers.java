package Modifiers;

    class employe{
    private int id;// if we use private then
    private String name;//we have to declare get and set method


    public void setname(String n) {
        this.name=n;
    }//for input

    public String getname(){
        return name;
    }// for output

        public int getid(){
            return id;
    }//for output

        public void setid(int i){
            this.id=i;
    }// for input
    }

    public class Access_Modifiers {
        public static void main(String[] args) {
            employe amu=new employe();

            ////Showing error because of "private access modifiers"
//             amu.id=1234;
//             amu.name="Aman";

             amu.setname("Aman");
             amu.setid(1234);
            System.out.println(amu.getname());
            System.out.println(amu.getid());

        }
    }


