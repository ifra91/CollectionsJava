package demo.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

public class SetEg2 {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("Hello");
        Set set2 = Set.of("Hello","world");

        Iterator itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for(String element:set){
            System.out.println(element);
        }

        Stream<String> str = set.stream();

    }



}
