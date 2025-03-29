package StringsQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {

        String s = "abbcabdx";

        String LongestSubstring =  null;
        int LongestSubstringLength = 0;

        Map<Character, Integer> map = new LinkedHashMap<>();
        //char[] arr = s.toCharArray();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,i);
            }else{
                i = map.get(ch);
                map.clear();
            }

            if(map.size() > LongestSubstringLength){
                LongestSubstringLength = map.size();
                LongestSubstring = map.keySet().toString();
            }
        }
        System.out.println(LongestSubstring);
        System.out.println(LongestSubstringLength);

    }
}
