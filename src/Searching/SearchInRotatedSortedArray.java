package Searching;

// Que Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(search(arr, target));
    }

    public static int search(int[] arr, int target) {
        int pivot = findPivot(arr);
        // if you did not find the pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(arr, target, 0, arr.length-1);
        }
        // if pivot is found, you have found two ascending sorted arrays.
        if (arr[pivot] == target) {
            return pivot;
        } else if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot-1);
        }
        return binarySearch(arr, target, pivot+1, arr.length-1);
    }

    public static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // ans found
                return mid;
            }
        }
        return -1;
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            // 4 cases here
            if (mid < end && arr[mid] > arr[mid+1]) {
                return mid;
            }else if (mid > start && arr[mid-1] > arr[mid]) {
                return mid -1;
            }else if (arr[start] < arr[mid]) {
                start = mid +1;
            }else if (arr[mid] <= arr[start]){
                end = mid -1;
            }
        }
        return -1;
    }
}
