package DurgeshDSA;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {90,50,30,60,20,80,10};

    }

    private static void reverseArray(int[] arr) {

//        for( int i=0; i<arr.length / 2 ; i++){
//            int temp = arr[i];
//            arr[i]= arr[arr.length-i-1];
//            arr[arr.length-i-1] = temp;
//        }

        int[] temp = new int[arr.length];
        for (int i = arr.length-1 ; i >= 0 ; i--) {
        temp[temp.length-i-1] = arr[i];
        }
        arr = temp;
    }
}
