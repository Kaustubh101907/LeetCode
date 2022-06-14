package Strings;

// Que Link: https://leetcode.com/problems/delete-operation-for-two-strings/
// Not Correct

import java.util.HashSet;

public class DeleteOperationForTwoString {
    public static void main(String[] args) {
        String s1 = "leetcode";
        String s2 = "etco";
        System.out.println(minDistance(s1, s2));
    }

    private static int minDistance(String s1, String s2) {
        String str1, str2;
        if (s1.length() > s2.length()) {
            str1 = s2;
            str2 = s1;
        } else {
            str1 = s1;
            str2 = s2;
        }
        HashSet<String> h= new HashSet<>();
        for (int i = str1.length(); i >= 0; i--) {
            h.add(str1.substring(0,i));
        }
        System.out.println(h);
        int count = 0;
        for (int i = str2.length() ; i >= 0; i--) {
            if (h.contains(str2.substring(0,i))) {
                break;
            } else {
                System.out.println(str2.substring(0,i));
                count++;
            }
        }
        return count -1;
    }
}
