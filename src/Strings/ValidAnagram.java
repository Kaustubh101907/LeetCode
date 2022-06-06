package Strings;

// Que Link: https://leetcode.com/problems/valid-anagram/

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    private static boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        for (int i = 0; i < s.length(); i++) {
            int x = s.charAt(i) - 'a';
            arr[x]++;
        }
        for (int i = 0; i < t.length(); i++) {
            int x = t.charAt(i) - 'a';
            arr[x]--;
        }
        for (int i = 0 ; i < 26; i++) {
            if (arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
