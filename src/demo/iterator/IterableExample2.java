package demo.iterator;

import demo.iterator.IterableDemo;

import java.util.Iterator;
import java.util.Spliterator;

public class IterableExample2 {

    public static void main(String[] args) {
        IterableImpl myIterable = new IterableImpl();
        myIterable.add("one");
        myIterable.add("two");

        for(String element:myIterable){
            System.out.println(element);
        }

        Iterator<String> iterator = myIterable.iterator();
        Spliterator<String> spliterator = myIterable.spliterator();


    }

}
