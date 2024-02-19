using System;

public class BinarySearch {

    // Since the array is sorted start in the middle.
    // Each time thru we divide the search of the
    // previous search by 2.
    public static int PerformBinarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.Length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Target not found
    }

    public static void Main(string[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int target = 13;
        int index = PerformBinarySearch(arr, target);
        Console.WriteLine("Index of target " + target + " is: " + index);
    }
}
