package Arrays;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        int[] ans = intersection(nums1, nums2);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        for (int i : nums1) {
            h1.add(i);
        }
        HashSet<Integer> h2 = new HashSet<>();
        for (int i : nums2) {
            h2.add(i);
        }
        ArrayList<Integer> al = new ArrayList<>();
        Integer[] arr = h1.toArray(new Integer[h1.size()]);
        for (int i = 0; i < h1.size(); i++) {
            if (h2.contains(arr[i])) {
                al.add(arr[i]);
            }
        }
        int[] ans = new int[al.size()];
        for (int i = 0; i < al.size(); i++) {
            ans[i] = al.get(i);
        }
        return ans;
    }
}
