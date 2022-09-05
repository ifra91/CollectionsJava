package demo.List;

import java.util.Enumeration;
import java.util.Vector;

//vector is a dynamic array
//it will increase the size automatically
//capacity will print the capacity
//Vector is thread safe arraylist is not
//vector is slow if only asked explicitly only use then otherwise use arrayList
public class VectorDemo {
    public static void main(String[] args) {

        Vector v = new Vector();
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);

        //number of elements it can hold
        System.out.println(v.capacity());
        //number of elements present
        System.out.println(v.size());

        Vector v1 = new Vector<>();
        for(int i =0; i<=10; i++){
            v1.addElement(i);
        }
        System.out.println(v1);
        Enumeration e =v.elements();
        //to print only even
        while(e.hasMoreElements()){
            Integer I = (Integer)e.nextElement();
            if(I % 2 == 0)
                System.out.println(I);
        }
        System.out.println(v1);

    }
}
