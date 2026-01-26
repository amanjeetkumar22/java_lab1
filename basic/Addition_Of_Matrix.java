package basic;

import java.util.Scanner;
public class Addition_Of_Matrix{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of row for first matrix:");
        int r = input.nextInt();
        System.out.print("Enter number of column for first matrix:");
        int c = input.nextInt();
        int[][] mat1=new int[r][c];
        System.out.println("Enter data for first matrix:");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter [" +(i+1)+"][" +(j+1)+ "] number:");
                mat1 [i][j] = input.nextInt();
            }
        }

        System.out.print("Enter number of row for 2nd matrix:");
        int r2 = input.nextInt();
        System.out.print("Enter number of column for 2nd matrix:");
        int c2 = input.nextInt();
        int[][] mat2 = new int [r2][c2];
        System.out.println("Enter data for 2nd matrix:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                System.out.print("Enter [" +(i+1)+"][" +(j+1)+ "] number:");
                mat2[i][j]=input.nextInt();
            }
        }
        System.out.println("Element of 1st Matrix:");
        for(int[] el:mat1) {
            for (int ele:el){
                System.out.print(ele+" ");

            }
            System.out.println();
        }
        System.out.println("Element of 2nd Matrix:");
        for(int[] el:mat2) {
            for (int ele:el){
                System.out.print(ele + " ");

            }
            System.out.println();
        }

        int[][]sum = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]= mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("Sum of matrix:");
        for(int[] el:sum) {
            for (int ele:el){
                System.out.print(ele + " ");

            }
            System.out.println();
        }

    }
}