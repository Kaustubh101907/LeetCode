package BitwiseOperators;

// Que Link: https://leetcode.com/problems/single-number/

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr = {4,1,2,1,2};
        System.out.println(singleNumber(arr));
    }

    private static int singleNumber(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length ; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }
}
