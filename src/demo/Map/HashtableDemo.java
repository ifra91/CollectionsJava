package demo.Map;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashtableDemo {
    public static void main(String[] args) {
        Map<String,String> map = new Hashtable<>();
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
