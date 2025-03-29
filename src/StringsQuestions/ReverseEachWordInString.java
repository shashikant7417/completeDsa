package StringsQuestions;

public class ReverseEachWordInString {

    public static void main(String[] args) {

        String str = "hello world";
        String[] stringArray = str.split(" ");
        for (String s : stringArray){
            for(int i = s.length()-1; i>=0; i--){
                System.out.print(s.charAt(i));
            }
            System.out.print(" ");
        }


    }
}
