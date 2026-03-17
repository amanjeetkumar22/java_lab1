package OOPS.Collection;

import java.util.HashSet;

public class Hash {
    public static void main(String[] args){
        HashSet<Integer> h = new HashSet<Integer>(6,0.5f);
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(4);
        h.add(3);
        System.out.println(h);

    }
}
