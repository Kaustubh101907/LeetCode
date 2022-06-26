package Arrays;

// Que Link: https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
// not correct

public class MaximumPointsYouCanObtainFromCards {
    public static void main(String[] args) {
        int[] arr = {9,7,7,9,7,7,9};
        int k = 7;
        System.out.println(maxScore(arr, k));
    }

    private static int maxScore(int[] arr, int k) {
        int start = 0;
        int end = arr.length -1;
        int sum = 0;
        for (int i = 0 ; i < k ; i++) {
            if (arr[start] > arr[end]) {
                sum += arr[start];
                start++;
            }
            if (arr[end] > arr[start]) {
                sum += arr[end];
                end--;
            } else {
                sum += arr[start];
                if(arr[start+1] > arr[end -1]) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return sum;
    }
}
