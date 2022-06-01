package Arrays;

// Que Link: https://leetcode.com/problems/merge-sorted-array/

import java.util.Arrays;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
    }

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                arr[k] = nums1[i];
                i++;
                k++;
            } else {
                arr[k] = nums2[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while (j < n) {
            arr[k] = nums2[j];
            j++;
            k++;
        }
        for (int a = 0 ; a < arr.length; a++) {
            nums1[a] = arr[a];
        }
    }
}
