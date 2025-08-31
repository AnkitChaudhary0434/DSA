package Linear_Search_Algorithm;

public class Code   {
    public static void main(String[] args) {
        int[] nums = {23, 34 , 45, 67, 87, 23,-32,89};
        int target = 0;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

    // search in the array: return the index if item found
    // otherwise return -1
    static int linearSearch(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }

        return Integer.MAX_VALUE;
    }

    //search the targate and return element
    static int linearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int index = 0; index < arr.length; index++){

            int element = arr[index];
            if (element == target){
                return index;
            }
        }

        return Integer.MAX_VALUE;
    }

    //search the targate and return true or false
    static boolean linearSearch3(int[] arr, int target){
        if (arr.length == 0){
            return false;
        }

        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;
    }
}

