package StringsQuestions;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "programming";

        // Approach 4
//        StringBuilder sb = new StringBuilder();
//        LinkedHashSet<Character> set = new LinkedHashSet<>();
//        for(int i =0 ; i< str.length(); i++){
//            set.add(str.charAt(i));
//        }
//        for(Character c : set){
//            sb.append(c);
//        }
//        System.out.println(sb);

//        // Approach 3
//        char[] arr = str.toCharArray();
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < arr.length; i++){
//            boolean repeated = false;
//            for(int j = i + 1 ; j <arr.length; j++){
//                if(arr[i] == arr[j]){
//                    repeated = true;
//                    break;
//                }
//            }
//            if(!repeated){
//                sb.append(arr[i]);
//            }
//
//        }
//        System.out.println(sb);


        //Approach 2 index of Method
//        StringBuilder sb = new StringBuilder();
//        for(int i =0 ; i<str.length(); i++){
//            char c = str.charAt(i);
//            int idx = str.indexOf(c, i + 1);
//            if(idx == -1){
//                sb.append(c);
//            }
//        }
//        System.out.println(sb);

        // Approach 1 by Java 8
        StringBuilder sb = new StringBuilder();
        str.chars().distinct().forEach(c -> sb.append((char)c));
        System.out.println(sb);

    }
}
