package demo.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetdemo4 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator1());
        t.add("A");
        t.add(new StringBuffer("ABC"));
        t.add(new StringBuffer("AA"));
        t.add(new StringBuffer("XX"));
        t.add(new StringBuffer("ABCd"));
        t.add(new StringBuffer("A"));
        System.out.println(t);
    }
}

class MyComparator1 implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int I1 = s1.length();
        int I2 = s2.length();
        if(I1 < I2) return -1;
        else if(I1>I2) return 1;
        else
        return s1.compareTo(s2);
    }
}
