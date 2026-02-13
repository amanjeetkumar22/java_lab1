package basic;

public class Array01 {
    public static void main(String[] args){

//        initialization of array

        // int [] marks = new int[5];
        int [] marks={1,2,3,4,5};
        System.out.println("lenght." + marks.length);

        for(int i=0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        // for each loop
        System.out.println("Marks of  Student:");
        for(int element:marks){
            System.out.println(element);
        }

//        int [] marks;
//        float[] marks;
//        marks = new int [5];
//
        marks[2]=87;
        System.out.println("Marks of 3rd person is :"+marks[2]);



    }

}
