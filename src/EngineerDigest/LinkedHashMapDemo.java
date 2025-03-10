package EngineerDigest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

    public static void main(String[] args) {

        LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
        map.put(1,"Apple");
        map.put(3,"Mango");
        map.put(2,"Banana");
        map.put(20,"Pineapple");
        map.put(7,"Watermelon");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
