package Linear_Search_Algorithm;

import java.util.Arrays;

public class Max2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13}
        };

        System.out.println(max(arr));
    }

    static int max(int[][] arr){
        int ans = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                if (arr[row][col] > ans){
                    ans = arr[row][col];
                }
            }
        }
        return ans;

    }
}
