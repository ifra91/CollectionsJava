package demo.SortingDemo.ArralistDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class Student{
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

class customSort implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student e1 = (Student)o1;
        Student e2 = (Student)o2;

        String s1 = e1.name;
        String s2 = e2.name;
        return s1.compareTo(s2);

    }
}

public class StudentData {
    public static void main(String[] args) {

        //creating student objects
        Student st1 = new Student("tim",12);
        Student st2 = new Student("tom",53);
        Student st3 = new Student("jon",24);
        Student st4 = new Student("doe",49);
        Student st5 = new Student("doe",49);

        ArrayList list = new ArrayList<>();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);

        customSort c = new customSort();

        list.sort(c);

        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next().toString());
        }


    }
}
