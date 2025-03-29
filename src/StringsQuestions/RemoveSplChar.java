package StringsQuestions;

public class RemoveSplChar {

    public static void main(String[] args) {

        String str = "$Ja!va$&st%ar";

        String replacedString = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(replacedString);
    }
}
