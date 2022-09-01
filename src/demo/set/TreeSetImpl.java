package demo.set;

import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetImpl {

    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(4);
        al.add(1);
        al.add(7);
        al.add(9);
        al.add(11);

        ts.addAll(al);
        System.out.println(ts);
        System.out.println(ts.size()); //size of set
        System.out.println(ts.first()); //first element
        System.out.println(ts.last()); //last element

        ts.pollFirst(); //remove first object
        ts.pollLast(); //remove last object
        ts.remove(4);

    }
}
