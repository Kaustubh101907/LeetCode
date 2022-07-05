package Sorting;

// Que Link: https://leetcode.com/problems/longest-consecutive-sequence/

import java.util.Arrays;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] nums = {1,2,0,1};
        System.out.println(longestConsecutive(nums));
    }

    private static int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int longest = 1;
        int curr = 1;
        for (int i = 0 ; i < nums.length -1; i++) {
            if (nums[i+1] == (nums[i])) {
                continue;
            }
            if (nums[i+1] == (nums[i] +1)) {
                curr++;
                if (curr > longest) {
                    longest = curr;
                }
            } else {
                curr = 1;
            }
        }
        return longest;
    }
}
