package TulescoDSA;

public class BubbleSort {

    public static void main(String[] args) {

        int[] numbs = {6,5,2,8,9,4};
        int size = numbs.length;
        int temp = 0;

        System.out.println("Before Sorting");
        for(int num: numbs){
            System.out.print(num + " ");
        }

        //Main Code for bubble sort

        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size-i-1; j++) {
                if(numbs[j]> numbs[j+1]){
                    temp = numbs[j];
                    numbs[j] = numbs[j+1];
                    numbs[j+1] = temp;
                }

            }


        }

        System.out.println(" ");
        System.out.println("After Sorting");
        for(int num: numbs){
            System.out.print(num + " ");
        }
    }
}
