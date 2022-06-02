package Arrays;

// Que Link: https://leetcode.com/problems/intersection-of-two-arrays-ii/submissions/

import java.util.*;

public class InsertionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == -1 || nums2[j] == -1) {
                    continue;
                }
                if (nums1[i] == nums2[j]) {
                    al.add(nums2[j]);
                    nums2[j] = -1;
                    nums1[i] = -1;
                }
            }
        }
        int[] ans = new int[al.size()];
        for (int i = 0 ; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}
