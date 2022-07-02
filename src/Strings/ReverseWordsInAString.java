package Strings;

// Que Link: https://leetcode.com/problems/reverse-words-in-a-string/

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "a good   example";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String str = "";
        for (int i = s.length() -1; i >=0; i--) {
            char x = s.charAt(i);
            if(x >= 'A' && x <= 'Z' || x >= 'a' && x <= 'z' || x >= '0' && x <= '9') {
                str += x;
            }
            if (i > 0 && (x == ' ' && s.charAt(i -1) != ' ')) {
                str += x;
            } else {
                continue;
            }
        }
        System.out.println(str);
        int ind = 0;
        String ss = "";
        for (int i = 0 ; i < str.length(); i++) {
            char x = str.charAt(i);
            if (x == ' ' || i == str.length() -1) {
                ss += reverse(str, ind, i);
                ind = i;
            }
        }
        return ss;
    }

    private static String reverse(String str, int ind, int i) {
        String s = "";
        for (int j = i-1; j >= ind; j--) {
            s += str.charAt(j);
        }
        s += ' ';
        return s;
    }
}
