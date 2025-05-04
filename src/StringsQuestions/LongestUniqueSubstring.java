package StringsQuestions;

import java.util.*;

public class LongestUniqueSubstring {
    public static void main(String[] args) {
        String s = "abcabdcsasch";

        int start = 0, maxLength = 0;
        String longestSubstring = "";
        Map<Character, Integer> map = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);

            // If the character is repeated, move `start` to the right of the last occurrence
            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }

            // Update the latest index of the character
            map.put(ch, end);

            // Update longest substring if current window is larger
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                longestSubstring = s.substring(start, end + 1);
            }
        }

        System.out.println("Longest substring: " + longestSubstring);
        System.out.println("Length: " + maxLength);
    }
}

