package Arrays;

// Que Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        arr = twoSum(arr, target);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] twoSum(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;
        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                return new int[]{start +1, end +1};
            }
            if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[] {-1, -1};
    }
}
