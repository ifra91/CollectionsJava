package demo.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
//we need to mention the logic of sorting technique
public class ComparatorDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(3);
        list.add(20);
        list.add(8);

        //for sorting elements
//        It will take any sorting technique
//list of object, pass the object of comparator which will define the logic
        //according to which we are sorting
//Comparator is not a class it is an Interface
//        Collections.reverse(list);

        //using CompImpl method
        Comparator<Integer> comp = new ComImpl();
        Collections.sort(list,comp);

        //using Anonymous classes
        Comparator<Integer> compl2 = new Comparator<Integer>() {

            public int compare(Integer o1, Integer o2) {

                if(o1 >o2)  //if(o1%10 > o2%10) we can change according to place value sort
                    return 1;
                return -1;
            }
        };
        Collections.sort(list,compl2);

        //using Lambda expression
//        Comparator<Integer>(list,(o1,o2) -> {
// return o1>o2 ? 1: -1;
//
//        });


        //for printing ele
       for (Object i : list){
           System.out.println(i);
       }
    }
}












