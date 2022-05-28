package Arrays;

// Que Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

public class RemoveDuplicatesFromASortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int n = removeDuplicates(nums);
        for (int i = 0 ; i < n ; i++) {
            System.out.print(nums[i]+ " ");
        }
        System.out.println();
        System.out.println(n);
    }

    public static int removeDuplicates(int[] nums) {
        int count = 1;
        for (int i = 0 ; i < nums.length ; i++) {
            if (i == 0) {
                continue;
            }
            if (nums[i] == nums[i -1]) {
                continue;
            } else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
