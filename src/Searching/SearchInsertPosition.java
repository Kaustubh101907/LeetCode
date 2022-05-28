package Searching;

// Que Link: https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start <= end) {
            int mid = start + (end - start) /2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                end = mid -1;
            } else {
                start = mid +1;
            }
        }
        return start;
    }

}
