package demo.set;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet t = new TreeSet(new MyComparator());
        t.add(10);
        t.add(12);
        t.add(11);
        t.add(14);
        t.add(15);
        System.out.println(t);

    }
}
//sorting order is in descending order
class MyComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Integer I1 = (Integer)o1;
        Integer I2 = (Integer)o2;
        if(I1 < I2)
            return +1;
        else if(I1>I2)
            return -1;
        else
        return 0;
    }
}