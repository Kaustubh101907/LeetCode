package Arrays;

// Que Link: https://leetcode.com/problems/remove-element/

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        int n = removeElement(nums, val);
        for (int i = 0 ; i < n ; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        System.out.println(n);
    }

    public static int removeElement(int[] nums, int val) {
        int c = 0;
        for (int i = 0 ; i < nums.length ; i++) {
            if (nums[i] != val) {
                nums[c] = nums[i];
                c++;
            }
        }
        return c;
    }
}
