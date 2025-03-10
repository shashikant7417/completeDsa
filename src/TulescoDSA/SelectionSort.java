package TulescoDSA;

public class SelectionSort  {

    public static void main(String[] args) {

        int[] numbs = {6,5,2,8,9,4};
        int size = numbs.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("Before Sorting");
        for(int num: numbs){
            System.out.print(num + " ");
        }

        // Main code for selection sort
        for (int i = 0; i < size-1 ; i++) {
            minIndex = i;
            for (int j = i+1; j <size ; j++) {

                if(numbs[minIndex] > numbs[j])
                    minIndex =j;

            }

            temp = numbs[minIndex];
            numbs[minIndex] = numbs[i];
            numbs[i] = temp;

        }


        System.out.println(" ");
        System.out.println("After Sorting");
        for(int num: numbs){
            System.out.print(num + " ");
        }
    }
}
