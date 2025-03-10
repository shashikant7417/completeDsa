package AnujDSA;

public class TrailingZeros {

    public static void main(String[] args) {
        int number = 12;
        int i = trailingZeros(number);
        System.out.println(i);

    }

    public static int trailingZeros(int n){
        int res = 0;

        for(int i=5; i<=n; i=i*5){
            res = res + n/i;
        }
        return res;
    }
}
