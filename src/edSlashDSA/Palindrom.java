package edSlashDSA;

public class Palindrom {

    public static void main(String[] args) {

    }

    public static boolean isPalindrom(String str){
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
