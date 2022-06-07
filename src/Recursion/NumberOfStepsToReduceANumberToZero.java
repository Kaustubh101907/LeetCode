package Recursion;

//Que Link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(numberOfSteps(n));
    }

    private static int numberOfSteps(int n) {
        if (n == 0) {
            return 0;
        }
        if (n % 2 == 0) {
            return 1 + numberOfSteps(n/2);
        }
        return 1 + numberOfSteps(n -1);
    }
}
