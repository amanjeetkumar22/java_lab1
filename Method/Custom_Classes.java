package Method;

// this is custom class  // also known as method
    class employee{
        int id;
        String name;
        int salary;

        // Now a method is defining here to print the detail
        public void print(){
            System.out.println(id);
            System.out.println(name);
            System.out.println(salary);

        }

        //creating function to print salary detail
        public int  salaryprnt(){
            return salary;
        }

    }
    public class Custom_Classes{
        public static void main(String[] args){

            employee newe = new employee();//Instantiating a new employee object
            employee newn = new employee();//

            //Setting attributes
            newe.id = 2345;
            newe.name = "Aman";
            newe.salary= 12;

            newn.id=1234;
            newn.name="raju";
            newn.salary=15;

            ////to print the detail
             System.out.println(newe.id);
             System.out.println(newe.name);

            ////printing detail using method
            // newe.print();
            // System.out.println();
            // newn.print();

            ////Printing salary of a particular object

             int rup=newe.salary;
             System.out.println("Salary." + rup);

            // System.out.println(newe.salary);

             int rupa=newe.salaryprnt();
             System.out.println("rupya." + rupa);

             newe.print();





        }
    }

