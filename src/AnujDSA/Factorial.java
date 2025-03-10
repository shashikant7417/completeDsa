package AnujDSA;

public class Factorial {

    public static void main(String[] args) {
        int number = 5;
        int result = calFactorial(number);
        System.out.println(result);
    }



    public static int calFactorial(int n){

        int fact = 1;

        for(int i=fact ; i <= n; i++ ){

            fact = fact * i;

        }
        return fact;

    }
}
