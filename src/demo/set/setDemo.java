package demo.set;

import java.util.HashSet;
import java.util.Set;

//set is an interface
//if we add value we cannot add duplicate elements
//it does not follow sequence
//it does hashing use some algorithm the nearest value to fetch will come first
//sequence will not be maintained
public class setDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(16);
        set.add(14);
        set.add(12);

        for(int i : set){
            System.out.println(i);
        }
    }

}
