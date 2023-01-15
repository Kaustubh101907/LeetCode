package Strings;

// Que Link: https://leetcode.com/problems/word-subsets/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSubsets {
    public static void main(String[] args) {
        String[] word1 = {"amazon","apple","facebook","google","leetcode"};
        String[] word2 = {"lo","eo"};
        ArrayList<String> al = (ArrayList<String>) wordSubsets(word1, word2);
        for (int i = 0 ; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    public static List<String> wordSubsets(String[] words1, String[] words2) {
        String[] arr = newArr(words2);
        ArrayList<String> al = new ArrayList<>();
        for (int i = 0 ; i < words1.length; i++) {
            boolean check = true;
            for (int j = 0 ; j < arr.length; j++) {
                if (!words1[i].contains(arr[j])) {
                    check = false;
                    break;
                }
            }
            if (check) {
                al.add(words1[i]);
            }
        }
        return al;
    }

    public static String[] newArr(String[] word2) {
        int count = 0;
        for (int i = 0; i < word2.length; i++) {
            count += word2[i].length();
        }
        String[] arr = new String[count];
        int a = 0;
        for(int i = 0; i < word2.length; i++) {
            for (int j = 0; j < word2[i].length(); j++) {
                arr[a] = String.valueOf(word2[i].charAt(j));
                a++;
            }
        }
        return arr;
    }
}
