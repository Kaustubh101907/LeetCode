package Arrays;

// Que Link: https://leetcode.com/problems/maximum-subarray/

public class MaximumSubarray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    private static int maxSubArray(int[] nums) {
        int sum = nums[0];
        int cs = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (cs <0) {
                cs = 0;
            }
            cs += nums[i];
            sum = Math.max(cs, sum);
        }
        return sum;
    }
}
