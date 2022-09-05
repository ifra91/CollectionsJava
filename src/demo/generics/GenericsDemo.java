package demo.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

//We use collection as 1. framework 2.I as interface and 3. as class
//1.0 collection and generics were not there
//Collection came from 1.2 and Generics from 1.5
//What are Generics?
//they are dynamic arrays
//type safety--> type of value is known at compile time, you have the type of the element
//Whenever we create list it is a list of objects
//to achieve type safety we must give type in angular brackets to make list of all same type elements
//also it handles error at compile time
//Generic only supports generic classes/classes
//To traverse use iterator and enhanced for loop

class Container<T extends Number>{

    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(value.getClass().getName());
    }


}
public class GenericsDemo {

    public static void main(String[] args) {
        Container<Float> obj = new Container();

        obj.show();


        //Collection of Objects
        Collection values = new ArrayList();
        values.add(3);
        values.add("new");
        values.add(3.2f);

        //Using iterator to print all elements in list
        Iterator i = values.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        //Enhanced For loop in place of iterator
        //we can fetch using datatype unboxing-autoboxing
        for(Object itr:values){
            System.out.println(itr);
        }


    }

}
