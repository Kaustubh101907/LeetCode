package Strings;

// Que Link: https://leetcode.com/problems/length-of-last-word/

public class LengthOfLastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }

    private static int lengthOfLastWord(String s) {
        int count = 0;
        for (int i = s.length() -1; i >= 0 ; i--) {
            char x = s.charAt(i);
            if (x == ' ' && count == 0) {
                continue;
            }
            if (x != ' ') {
                count++;
            }
            if (x == ' ')
                break;
        }
        return count;
    }
}
