package Strings;

// Que Link: https://leetcode.com/problems/ransom-note/

public class RansomNote {
    public static void main(String[] args) {
        String ransomNote = "aab";
        String magazine = "baa";
        System.out.println(canConstruct(ransomNote, magazine));
    }

    private static boolean canConstruct(String ransomNote, String magazine) {
        int[] arr = new int[26];
        for (int i = 0 ; i < magazine.length(); i++) {
            int x = magazine.charAt(i) - 97;
            arr[x]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            int x = ransomNote.charAt(i) - 97;
            if (arr[x] > 0) {
                arr[x]--;
            } else {
                return false;
            }
        }
        return true;
    }
}
