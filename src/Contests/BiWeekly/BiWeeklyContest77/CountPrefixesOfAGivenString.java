package Contests.BiWeekly.BiWeeklyContest77;

import java.util.HashSet;

public class CountPrefixesOfAGivenString {
    public static void main(String[] args) {
        String[] arr = {"a","b","c","ab","bc","abc"};
        String s = "abc";
        System.out.println(countPrefixes(arr, s));
    }

    private static int countPrefixes(String[] arr, String s) {
        HashSet<String> h = new HashSet<>();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str += s.charAt(i);
            h.add(str);
        }
        int count = 0;
        for (int i = 0 ; i < arr.length; i++) {
            if (h.contains(arr[i])) {
                count++;
            }
        }
        return count;
    }
}
