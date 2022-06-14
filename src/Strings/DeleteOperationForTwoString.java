package Strings;

// Que Link: https://leetcode.com/problems/delete-operation-for-two-strings/

import java.util.HashSet;

public class DeleteOperationForTwoString {
    public static void main(String[] args) {
        String s1 = "sea";
        String s2 = "eat";
        System.out.println(minDistance(s1, s2));
    }

    private static int minDistance(String s1, String s2) {
//        String str1, str2;
//        if (s1.length() > s2.length()) {
//            str1 = s2;
//            str2 = s1;
//        } else {
//            str1 = s1;
//            str2 = s2;
//        }
        HashSet<String> h= new HashSet<>();
        for (int i = 1; i <= s1.length(); i++) {
            h.add(s1.substring(0,i));
        }
        int count = 0;
        for (int i = s2.length() ; i <= 0; i--) {
            if (h.contains(s2.substring(0,i))) {
                return count;
            } else {
                count++;
            }
        }
        return count;
    }
}
