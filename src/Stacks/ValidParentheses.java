package Stacks;

// Que Link: https://leetcode.com/problems/valid-parentheses/

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String s = "(){}[]";
        System.out.println(isVaalid(s));
    }

    public static boolean isVaalid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0 ; i < s.length() ; i++) {
            char x = s.charAt(i);
            if(x == '{' || x == '(' || x == '[') {
                st.push(x);
            } else {
                if (s.isEmpty()) {
                    return  false;
                } else if (isMatching(st.peek(), x) == false) {
                    return false;
                } else {
                    st.pop();
                }
            }
        }
        return st.isEmpty();
    }

    public static boolean isMatching(char a, char b) {
        return (a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']');
    }
}
