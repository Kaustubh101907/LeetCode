package Strings;

// Que Link: https://leetcode.com/problems/implement-strstr/

public class ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        StringBuilder str = new StringBuilder(haystack);
        return str.indexOf(needle);
    }
}
