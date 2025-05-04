package StringsQuestions;

import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String lCase = input.toLowerCase();
        int count = 0;

        for(char c : lCase.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                count++;
            }
    }
        System.out.println(count);
    }
}
