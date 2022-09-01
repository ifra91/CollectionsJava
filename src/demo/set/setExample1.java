package demo.set;

import java.sql.Array;
import java.util.*;

public class setExample1 {

    public static void main(String[] args) {
        int[] count = {12,13,1,5,67,2};
        int[] countNew = {67,34,2,8,100,2};

        Set<Integer> set1= new HashSet<>();

        for(int i =0 ; i<=5; i++) {
            set1.add(count[i]);
        }
        System.out.println(set1);

        Set<Integer> set2= new HashSet<>();
        for(int i =0 ; i<=5; i++) {
            set2.add(countNew[i]);
        }
        System.out.println(set2);

        TreeSet<Integer> sortedSet = new TreeSet<>(set1);
        TreeSet<Integer> sortedSet1 = new TreeSet<>(set2);

        System.out.println("Sorted List:" + sortedSet);
        System.out.println("Sorted List:" + sortedSet1);

        // Operations on Set
        //union ==> addAll() , intersection ==> retainAll(), difference ==> removeAll()

        //Taking int array
        Integer[] arr1 = {2,5,8,1,3,6};
        Integer[] arr2 = {5,48,2,4,9};

        //Adding array elements to set
        Set<Integer> s1 = new HashSet<>();
        s1.addAll(Arrays.asList(arr1));

        Set<Integer> s2 = new HashSet<>();
        s2.addAll(Arrays.asList(arr2));

        //Union of Data
        Set<Integer> unionSet = new HashSet<>(s1);
        unionSet.addAll(s2);
        System.out.println("Union is " + unionSet);
        //result is unsorted list

        //Intersection of data
        Set<Integer> IntersectionSet = new HashSet<>(s1);
        IntersectionSet.retainAll(s2);
        System.out.println("Intersection is " + IntersectionSet);

        //Deletion of data
        Set<Integer> deletionSet = new HashSet<>(s1);
        deletionSet.removeAll(s2);
        System.out.println("Intersection is " + deletionSet);

// Iterator in set
        Iterator<Integer> it = s1.iterator();
        while(it.hasNext()){
            System.out.println( it.next());
        }
        //Methods in Java
        //Add method
        System.out.println(s1.add(20));
        //clear() removes element; does not delete refernce only deletes element
        //contains() returns true if there is element present in list or not
        System.out.println( s1.contains(50));
        //containsAll() returns true if all collection data is present in the

        s1.remove(20);
        //isEmpty(), hashcode()




    }




}
