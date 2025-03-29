package StringsQuestions;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {

        String inputString = "hello";


        //Approach 5
        StringBuilder sb = new StringBuilder(inputString);
        System.out.println(sb.reverse());

        //Approach 4
//        StringBuffer sb = new StringBuffer(inputString);
//        System.out.println(sb.reverse());


        // Approach 3

//        for(int i = inputString.length() -1 ; i>=0; i--){
//            System.out.print(inputString.charAt(i));
//        }



        //Approach 2

//        char[] charArray = inputString.toCharArray();
//
//        for(int i = charArray.length -1 ; i>=0; i--){
//            System.out.print(charArray[i]);
//
//        }


        //Approach 1
//        char[] charArray = inputString.toCharArray();
//        int left = 0;
//        int right = charArray.length  -1;
//
//        while (left < right) {
//            char temp = charArray[left];
//            charArray[left] = charArray[right];
//            charArray[right] = temp;
//
//            left++;
//            right--;
//        }
//        System.out.println(charArray);

        }

    }

