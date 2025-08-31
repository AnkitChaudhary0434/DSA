package Linear_Search_Algorithm;

public class Qustion1 {
    public static void main(String[] args) {
        /* Gives an array nums of integers, returns how many of them contains an even number of digits.
            eg:-
                Input - nums = [12,345,2,6,7896]
                output - 2
                explaination ;-
                    12 contains 2 digits - even
                    345 contains 3 digits - odd
        */


        int[] nums = {12,345,2,6,7896,234545};
        System.out.println(findNumber(nums));
    }

    static int findNumber(int[] arr){
        int count = 0;
        for (int i : arr) {
            if (even(i)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int element) {
        int numberOfDigits = digit(element);
        if (numberOfDigits % 2 == 0){
            return true;
        }
        return false;
    }

    static int digit(int element){
        int count = 0;

        while (element >0){
            count ++;
            element = element / 10;
        }
        return count;
    }
}
