package Arrays;

public class MinimumOperationsToReduceXtoZero {
    public static void main(String[] args) {
        int[] nums = {1,1};
        int x = 3;
        System.out.println(minOperations(nums, x));
    }

    private static int minOperations(int[] nums, int x) {
        int start = 0;
        int end = nums.length -1;
        int count = 0;
        if (nums[start] == x || nums[end] == x) {
            return 1;
        }
        while (x > 0 && start < end) {
            if (x < nums[start] && x < nums[end]) {
                return -1;
            }
            if (x > nums[start] && nums[start] > nums[end]) {
                x = x - nums[start];
                start++;
            } else {
                x = x - nums[end];
                end--;
            }
            count++;
        }
        if (start <= end) {
            return -1;
        }
        return count;
    }
}
