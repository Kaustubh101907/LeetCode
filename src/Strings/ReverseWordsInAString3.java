package Strings;

// Que Link: https://leetcode.com/problems/reverse-words-in-a-string-iii/

public class ReverseWordsInAString3 {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        int i = 0;
        char[] arr = s.toCharArray();
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] == ' ') {
                reverse(arr, i, j-1);
                i = j+1;
            }
            if (j == arr.length -1) {
                reverse(arr, i, j);
            }
        }
        return String.valueOf(arr);
    }

    public static void reverse (char[] arr, int start, int end) {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
