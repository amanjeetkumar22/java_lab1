package basic;
import java.util.Scanner;
public class Array2D{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.print("row:");
        int r =sc.nextInt();
        System.out.print("column:");
        int c =sc.nextInt();
        int [][] array;

        array= new int [r][c];
        for (int i =0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print("Enter ["+(i+1) + "][" +(j+1) + " Number: ");
                array[i][j]=sc.nextInt();
            }
        }
        // for (int i =0;i<r;i++){
        //     for (int j=0;j<c;j++){
        //         System.out.print(array[i][j]);
        //     }
        //     System.out.println();
        // }

        for (int []e : array){
            for(int el : e){
                // System.out.print(el + " ");
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }
}
