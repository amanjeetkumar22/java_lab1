package Assignement.day4;
import java.util.Scanner;

class Studentcheck {
    int rollNo;

    Studentcheck(int r) {
        rollNo = r;
    }

    public boolean equals(Object obj) {
        Studentcheck s = (Studentcheck) obj;
        return rollNo == s.rollNo;
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter roll no of student 1: ");
        int r1 = sc.nextInt();

        System.out.print("Enter roll no of student 2: ");
        int r2 = sc.nextInt();

        Studentcheck s1 = new Studentcheck(r1);
        Studentcheck s2 = new Studentcheck(r2);

        if (s1.equals(s2))
            System.out.println("Students are equal");
        else
            System.out.println("Students are not equal");
    }
}
