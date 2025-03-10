package DurgeshDSA;

public class LargestNumber {

    public static void main(String[] args) {
        int[] arr = {80,70,20,40,90,10,30,50};
        int result = largestNumber(arr);
        System.out.println(result);

    }

    public static int largestNumber(int[] arr){

        int largeNumber = arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>largeNumber)
                largeNumber = arr[i];


        }

        return largeNumber;

    }
}
