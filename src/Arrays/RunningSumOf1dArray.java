package Arrays;

// Que Link: https://leetcode.com/problems/running-sum-of-1d-array/

import java.util.Arrays;

public class RunningSumOf1dArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] ans = runnungSum(nums);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] runnungSum(int[] nums) {
        for(int i = 0 ; i< nums.length ; i++){
            if(i==0){
                nums[0]= nums[0];
            }else{
                nums[i]+= nums[i-1];
            }
        }
        return nums;
    }
}
