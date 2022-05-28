package Searching;

// Que Link: https://leetcode.com/problems/sqrtx/

public class Sqrtx {
    public static void main(String[] args) {
        int x = 9;
        System.out.println(mySqrt(x));
    }

    private static int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;
        while (start <= end) {
            int mid = start + (end - start) /2;
            if (mid <= x/mid) {
                ans = mid;
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        return ans;
    }
}
