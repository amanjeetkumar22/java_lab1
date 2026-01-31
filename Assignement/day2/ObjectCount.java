package Assignement.day2;

/*Program to find no. of objects created out of a
class using ‘static’ modifier.
Input:   No of objects created
Output: Display the number of objects created*/

public class ObjectCount {
     static int count=0;

    ObjectCount(){
        count++;
    }
    void display(){
        System.out.print("Number of objects: " +count);
    }

    public static void main(String []args){
        ObjectCount ob=new ObjectCount();
        ObjectCount ob1=new ObjectCount();
        ObjectCount ob2=new ObjectCount();
        ob.display();
    }
}
