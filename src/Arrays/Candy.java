package Arrays;

// Que Link: https://leetcode.com/problems/candy/

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
         int[] arr = {4,6,4,5,4,3,6,8};
        System.out.println(candy(arr));
    }

    private static int candy(int[] arr) {
        int[] ans = new int[arr.length];
        Arrays.fill(ans, 1);
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i+1] > arr[i]) {
                ans[i+1] = ans[i] +1;
            }
        }
        System.out.println(Arrays.toString(ans));
        for (int i = arr.length -1; i > 0; i--) {
            if (arr[i-1] > arr[i] && ans[i-1] <= ans[i]) {
                ans[i-1] = ans[i] +1;
            }
        }
        System.out.println(Arrays.toString(ans));
        int sum = 0;
        for (int i = 0 ; i < ans.length; i++) {
            sum += ans[i];
        }
        return sum;
    }
}
