package StringsQuestions;

public class RemoveWhiteSpaceInString {
    public static void main(String[] args) {

        String str = "  ja  v  a  st a  r  ";
        String replaced = str.replaceAll("\\s", "");
        System.out.println(replaced);
    }
}
