package Practise11;

public class Q2 {
    // data members of the class
        String name;
        int id;

        // Parameterized Constructor
        Q2(String name, int id)
        {
            this.name = name;
            this.id = id;
        }

        // Method to display object data
        void display(){

            System.out.println("Name: " + name
                    + " and Id: " + id);
        }

        // main() method — placed inside the same class for
        // universal compatibility
        public static void main(String[] args){

            // This will invoke the parameterized constructor
            Q2 g1 = new Q2("Sweta", 68);
            g1.display();
        }
    }

