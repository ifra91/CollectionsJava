package demo.iterator;


import java.util.*;

public class IterableDemo {
    public static void main(String[] args) {
       List<String> list = new ArrayList<>();
       list.add("john");
        list.add("doe");
        list.add("tim");

        Collection<String> collection = list;
        Iterable<String> iterable;
        iterable = collection;

        //built-in for each loop in java
        for(String element: iterable){
            System.out.println(element);

        }

        //iterable message
        Iterator<String> itr = iterable.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        //using explicit forEach loop
        iterable.forEach((element)->{
            System.out.println(element);
        }) ;

        //using split iterator
        Spliterator<String> splitItr = iterable.spliterator();
    }
}
