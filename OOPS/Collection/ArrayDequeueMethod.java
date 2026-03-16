package OOPS.Collection;

import java.util.ArrayDeque;

public class ArrayDequeueMethod {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ArrayDeque<Integer> ad2 = new ArrayDeque<>();
        ad1.add(1);
        ad1.add(2);
        ad1.add(3);
        ad2.add(4);
        ad2.add(5);
        ad1.addAll(ad2);
        ad1.addFirst(6);

        System.out.println(ad1.getFirst());
        System.out.println(ad2.getLast());
    }
}
