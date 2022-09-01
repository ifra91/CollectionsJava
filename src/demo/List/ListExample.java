package demo.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List myList = new ArrayList<>();
        myList.add("Object 1");
        myList.add("Object 2");
        myList.add("Object 3");
        myList.add("Object 4");

        //remove(index) method it has to reference to object in list or it can be index
        //get(index) to get value at given index
        //size() to get the value of number of elements present in an array

        //to loop thru objects is by iterator anf for each and for loop

        Iterator itr = myList.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        for (Object li:
             myList) {

            System.out.println(li);

        }

        for(int i =0; i<=myList.size()-1; i++){
            System.out.println(myList.get(i));
        }

        //Empty a list by using clear() method
        //Generic list is a List with a type

    }
}
