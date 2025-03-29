package StringsQuestions;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepetedCharacter {

    public static void main(String[] args) {

        String str = "AABCDBECF";

        // Approach 1 without using collection
        Map<Character, Integer> map = new HashMap<>();

        for(int i =0 ; i< str.length(); i++) {
            Character ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }

        }

//         for(int i = 0 ; i<str.length(); i++){
//             boolean unique = true;
//
//             for(int j=0; j<str.length(); j++){
//
//                 if(i != j && str.charAt(i) == str.charAt(j)){
//                     unique = false;
//                     break;
//                 }
//             }
//
//             if(unique){
//                 System.out.println(str.charAt(i));
//                 break;
//             }
//
//         }
    }
}
