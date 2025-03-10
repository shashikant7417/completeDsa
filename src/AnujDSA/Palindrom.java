package AnujDSA;

public class Palindrom {

    public static void main(String[] args) {
        int[] testNumbers = {121, -121, 12321, 123, 0, 1, 1221, -1221};

        for (int testNumber : testNumbers) {
            System.out.println(testNumber + " is a palindrome? " + isPalindrome(testNumber));
        }
    }

    public static boolean isPalindrome(int number){
        int originalNumber = number;
        int reverseNumber = 0;
        int remainder;

        while(number != 0){
            remainder = number % 10;
            reverseNumber = reverseNumber * 10 + remainder;
            number = number / 10;
        }
        return originalNumber == reverseNumber;
    }
}
