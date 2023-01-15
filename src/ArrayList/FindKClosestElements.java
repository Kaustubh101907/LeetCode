package ArrayList;

// Que Link: https://leetcode.com/problems/find-k-closest-elements/

import java.util.*;

public class FindKClosestElements {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 4;
        int x = 3;
        ArrayList<Integer> al = findClosestElements(arr, k, x);
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
    }

    public static ArrayList<Integer> findClosestElements(int[] arr, int k, int x) {
        int start = 0;
        int end = arr.length -1;
        while (end - start >= k) {
            if (Math.abs(arr[start] - x) > Math.abs(arr[end] - x)) {
                start++;
            } else {
                end--;
            }
        }
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = start; i<= end; i++) {
            al.add(arr[i]);
        }
        return al;
    }
}
