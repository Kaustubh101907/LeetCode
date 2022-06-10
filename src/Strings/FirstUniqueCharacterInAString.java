package Strings;

// Que Link: https://leetcode.com/problems/first-unique-character-in-a-string/

public class FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }

    private static int firstUniqChar(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i) - 97] == 1) {
                return i;
            }
        }
        return -1;
    }
}
