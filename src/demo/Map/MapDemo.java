package demo.Map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Map takes key and value
//we use put method to add value to map
//we can repeat the value but we cannot duplicate the keys

public class MapDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        map.put("key4","value4");

        System.out.println(map);

        //to print all values make set of keys

        Set keys = map.keySet();

        for(Object key:keys){
            System.out.println(key+ " " + map.get(key));
        }
    }
}

//Entry is a nested interface inside map interface there is method entry set
//key value pair is one entry we will be getting whole table
//working is same , insertion order is not fixed
//hashtable was present from 1.0, they are thread safe when working with multiple threads youcannot have null key
//hashmap is 1.2 and it is not thread safe, and faster, we can have one null key in hashmap

//linked hashmap

//Double braces instantiation
/*
* List<Integer> value = new ArrayList<>()
* {{
* add(56);
* add(57);
* add(58);
* }};
*
* //outer bracket is anaoymous inner class
* //and inner braceket is for instantiation of list
* */