package Simulation;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class NumberOfStepsToReduceANumberToZero {
    public static void main(String[] args) {
        int n = 123;
        System.out.println(numberOfSteps(n));
    }

    private static int numberOfSteps(int n) {
        int count = 0;
        while (n > 0) {
            if (n % 2 == 0) {
                n /= 2;
                count++;
            } else {
                n--;
                count++;
            }
        }
        return count;
    }
}
