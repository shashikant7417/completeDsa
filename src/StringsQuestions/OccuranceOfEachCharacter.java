package StringsQuestions;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class OccuranceOfEachCharacter {

    public static void main(String[] args) {

        String str = "hiilllloooooo";

        Map<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for(Character ch : arr){
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else {
                map.put(ch, map.get(ch)+1);
            }
        }
        System.out.println(map);
    }
}
