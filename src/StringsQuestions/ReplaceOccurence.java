package StringsQuestions;

import java.util.Arrays;

public class ReplaceOccurence {
    public static void main(String[] args) {

        String str = "testtest";
        char charToReplace = 't';

        if(str.indexOf(charToReplace) == -1){
            System.out.println("Character id not available in input string");
            System.exit(0);
        }
        int count =1;

        for(int i =0; i<str.length(); i++){
            if(str.charAt(i) == charToReplace){
                str = str.replaceFirst(String.valueOf(charToReplace), String.valueOf(count));
                count++;
            }
        }
        System.out.println(str);


        //only works with small numbers

//        char[] inputArr = str.toCharArray();
//        int count = 1;
//        for(int i = 0 ; i< inputArr.length; i++){
//            if(inputArr[i] == 't'){
//                inputArr[i] = String.valueOf(count).charAt(0);
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(inputArr));

    }
}
