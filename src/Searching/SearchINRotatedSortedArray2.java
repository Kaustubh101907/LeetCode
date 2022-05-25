package Searching;

// Que Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

public class SearchINRotatedSortedArray2 {
    public static void main(String[] args) {
        int[] arr = {7, 8, 1, 2, 2, 2, 3, 3, 4, 6, 6};
        int target = 4;
        System.out.println(search(arr, target));
    }

    private static int search(int[] arr, int target) {
        int pivot = findPivotWithDuplicates(arr);
        // if you did not find a pivot, that means the array is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length -1);
        }
        // if pivot is found, you have two sorted arrays
        if (pivot == target) {
            return pivot;
        }
        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot -1);
        }
        return binarySearch(arr, target, pivot+1, arr.length -1);
    }

    private static int binarySearch(int[] arr, int target, int start, int end) {
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

    private static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end = arr.length -1;
        while (start <= end) {
            int mid = start + (end - start)/2;
            if (mid < end && arr[mid] > arr[mid +1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid -1]) {
                return mid -1;
            }
            // if elements at middle, start, end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end are the pivot?
                // check if start is pivot
                if (start < end && arr[start] > arr[start +1]) {
                    return start;
                }
                start++;
                // check whether end is pivot
                if (end > start && arr[end] < arr[end -1]) {
                    return end -1;
                }
                end--;
            }
            // lest side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }
}
