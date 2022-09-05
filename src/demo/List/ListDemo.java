package demo.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(3);
        list.add(20);
        list.add(8);

        //for sorting elements
        Collections.sort(list);
        //for printing ele
        list.forEach(System.out::println); //Stream Api Lambda Expression

    }
}
