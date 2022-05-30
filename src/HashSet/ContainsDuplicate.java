package HashSet;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2};
        System.out.println(containsDuplicate(nums));
    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        for (int i = 0 ; i < nums.length; i++) {
            if (!h.contains(nums[i])) {
                h.add(nums[i]);
            } else {
                return true;
            }
        }
        return false;
    }
}
