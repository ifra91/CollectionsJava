package demo.SortingDemo.ArralistDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {
    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("volkswagen");
        nameList.add("bmw");
        nameList.add("jeep");
        nameList.add("rover");
        nameList.add("alto");
        nameList.add("maruti");
        nameList.add("suzuki");
        nameList.add("honda");

        System.out.println(nameList);
        Collections.sort(nameList);
        System.out.println(nameList);

        Collections.reverse(nameList);
        System.out.println(nameList);

    }
}
