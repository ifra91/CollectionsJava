package demo.iterator;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hanna");
        list.add("heidi");
        list.add("john");
        list.add("doe");

        ListIterator listItr = list.listIterator();
        //iterate as entered in list
        while (listItr.hasNext()){
            System.out.println(listItr.next());
        }
        //Iterate in descending order
        while (listItr.hasPrevious()){
            System.out.println(listItr.previous());
        }

    }
    }

