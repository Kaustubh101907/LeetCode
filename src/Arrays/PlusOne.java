package Arrays;

// Que Link: https://leetcode.com/problems/plus-one/

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int[] ans = plusOne(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] plusOne(int[] arr) {
        for (int i = arr.length -1; i >= 0; i--) {
            int ld = arr[i];
            if (ld == 9) {
                arr[i] = 0;
            } else {
                arr[i] += 1;
                break;
            }
        }
        if(isEmpty(arr)) {
            int[] res = new int[arr.length +1];
            res[0] = 1;
            return res;
        }
        return arr;
    }

    private static boolean isEmpty(int[] arr) {
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] == 0) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
