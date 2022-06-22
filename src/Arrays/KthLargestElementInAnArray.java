package Arrays;

// Que Link: https://leetcode.com/problems/kth-largest-element-in-an-array/

import java.util.Arrays;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        int k = 2;
        System.out.println(findKthLargest(nums, k));
    }

    private static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length -k];
    }
}
