package TulescoDSA;

public class SearchingAlgo {

    public static void main(String[] args) {

        int[] numbs = {5,7,11,15,17};
        int target = 17;
        int result = binarySearchRecursive(numbs,target, 0, numbs.length -1);
        if(result != -1)
        System.out.println("Element found at index: "+result+ " and result is: "+numbs[result]);
        else
            System.out.println("Element Not Found");
    }



    public static int linearSearch(int[] numbs, int target) {

        for(int i =0; i<numbs.length; i++){
            if(numbs[i] == target)
                return i;
        }

        return -1;
    }

    public static int binarySearchRecursive(int[] numbs, int target, int left, int right) {

        if(left <= right){
            int mid = (left + right)/2;
            if(numbs[mid] == target)
                return mid;

            else if (numbs[mid] < target)
                return binarySearchRecursive(numbs,target,mid+1,right);

            else
                return binarySearchRecursive(numbs,target,left,mid-1);

        }
        return -1;


    }

    public static int binarySearch(int[] numbs, int target) {

        int left = 0;
        int right = numbs.length -1;

        while(left <= right){
            int mid = (left + right)/2;

            if(numbs[mid] == target){
                return mid;
            }
            else if (numbs[mid] < target) {
                left = mid +1;

            }else
                right = mid-1;

        }

        return -1;

    }


}
