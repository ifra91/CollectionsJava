package demo.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IteratorExample1 {

    public static void main(String[] args) {

        //Using ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("hanna");
        list.add("heidi");
        list.add("john");
        list.add("doe");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()){

            System.out.println(itr.next());

        }

        //Using Set
        Set<String> set = new HashSet<>();
        set.add("john");
        set.add("doe");
        set.add("tim");
        set.add("rin");

        Iterator<String> itr1 = set.iterator();
        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

    }


}
