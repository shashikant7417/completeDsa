package EngineerDigest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Mango");
        map.put(4,"Apple");

        System.out.println(map);
        System.out.println(map.get(2));

        final Set<Integer> keys = map.keySet();
        for(Integer i : keys){
            System.out.println(map.get(i));
        }

        System.out.println("Example of entry set");

        final Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for(Map.Entry<Integer, String> entry :entries){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }

    }
}
