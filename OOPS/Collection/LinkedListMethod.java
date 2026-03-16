package OOPS.Collection;

import java.util.*;

public class LinkedListMethod {
    public static void main (String[] args){
    LinkedList<Integer> l1= new LinkedList<>();
    LinkedList<Integer> l2=new LinkedList<>();
    l1.add(1);
    l1.add(2);
    l1.add(3);
    l1.add(4);
    l2.add(13);
    l1.addAll(l2);
//       l1.clear();

        //LinkedList SpecialMethod
        l1.addLast(5);
        l1.addFirst(6);

//       System.out.println(l1);
//
//       System.out.println();
//
////       // using for each loop
////       for (Integer i:l1){
////           System.out.println(i);
////       }
//
            System.out.println();

            for (int i=0;i<l1.size();i++){
                System.out.println(l1.get(i));
            }

//            System.out.println(l1.containsAll(l2));
//            System.out.println(l1.contains(8));
//            System.out.println(l1.indexOf(4));
//            System.out.println(l1.lastIndexOf(4));
//            l1.set(1,10);
//            System.out.println(l1.get(1));
    }
}


