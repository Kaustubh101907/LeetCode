package Arrays;

// Que Link: https://leetcode.com/problems/non-decreasing-array/
// not correct

public class NonDecreasingArray {
    public static void main(String[] args) {
        int[] nums = {3,4,2,3};
        System.out.println(checkPossibility(nums));
    }

    private static boolean checkPossibility(int[] nums) {
        int check = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i -1]) {
                check++;
            }
        }
        return (check == 1);
    }
}
