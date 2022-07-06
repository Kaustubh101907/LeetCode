package Recursion;

// Que Link: https://leetcode.com/problems/fibonacci-number/

public class FibonacciNumber {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(fib(n));
    }

    private static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
}
