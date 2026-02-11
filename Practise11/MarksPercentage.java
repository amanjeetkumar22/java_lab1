package Practise11;
import java.util.*;
public class MarksPercentage {
    public static void main(String[] args){
        Scanner marks=new Scanner (System.in);
        System.out.print("Enter number of subjects:");
        int  n=marks.nextInt();
        float mark=0;

        for(int i=1;i<=n;i++){
            System.out.print("Enter Mark in subject "+ i+ ":");
            mark= mark + marks.nextInt();
        }
        System.out.println("Total marks: "+mark);

        float avg=mark/n;
        System.out.print("Percentage  of "+n+" subjects:"+ avg);
        marks.close();
    }
}
