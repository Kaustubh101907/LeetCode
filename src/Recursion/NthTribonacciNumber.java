package Recursion;

// Que Link: https://leetcode.com/problems/n-th-tribonacci-number/

public class NthTribonacciNumber {
    public static void main(String[] args) {
        int n = 34;
        System.out.println(tri(n));
    }

    private static int tri(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        return tri(n-1) + tri(n-2) + tri(n-3);
    }
}
