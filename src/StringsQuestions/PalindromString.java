package StringsQuestions;

import AnujDSA.Palindrom;

import java.util.Scanner;

public class PalindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char[] charArray = input.toCharArray();

        int left = 0;
        int right = charArray.length -1;

        while(left < right){

            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        String output = new String(charArray);

        if(input .equals(output)){
            System.out.println("String is Palindrom");
        }else {
            System.out.println("String is not a Palindrome");
        }

    }
}
