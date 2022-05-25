package BitwiseOperators;

// Que Link: https://leetcode.com/problems/powx-n/
// Not Solved

public class PowXN {
    public static void main(String[] args) {
        double x = 2.10000;
        int n = 3;
        System.out.println(myPow(x, n));
    }

    private static double myPow(double x, int n) {
        double ans = 1;
        double base = x;
        while (n > 0) {
            if ((n & 1) == 1) {
                ans *= base;
            }
            base *= base;
            n = n >> 1;
        }
        return ans;
    }
}
