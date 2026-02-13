package basic;
import java.util.Scanner;

public class first {
    public static void main (String[] args){

        //Declaration of string

        String name= new String("amanjeet");

        String name1="amanjeet";

        System.out.println(name);

        // for length

        int value=name.length();
         System.out.println("lenght. " + value);

          // to print in uppercase
        String newe=name1.toUpperCase();
        System.out.println("upper case. " + newe);

        //using of printf

            System.out.printf("%s\n",newe);
        System.out.format("%s\n",newe);


//        System.out.println(name.replace('a','k'));
//        System.out.println(name.replace("a","ma"));

//        String nam="Aman Jeet";
//        System.out.println(nam.replace(' ','_'));
        String c="Hello Mr Aman  Jeet";
        System.out.println(c.indexOf("  "));
        System.out.println(c.lastIndexOf("   "));
    }
}


