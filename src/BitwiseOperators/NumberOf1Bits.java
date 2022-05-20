package BitwiseOperators;

// Que Link: https://leetcode.com/problems/number-of-1-bits/

public class NumberOf1Bits {
    public static void main(String[] args) {

    }

    public int hammingWeight(int n) {
        int ones = 0;
        while(n!=0) {
            ones = ones + (n & 1);
            n = n>>>1;
        }
        return ones;
    }
}
