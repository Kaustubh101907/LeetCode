package Searching;

// Que Link: https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3,5,7};
        int target = 6;
        System.out.println(searchInsert(nums, target));
    }

    private static int searchInsert(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
          int mid=start+end/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }

        }
        return start;
    }
}
