package BinarySearch;

public class searchInSortedAndRotated {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,10,1,2,3};
        int lo = 0, hi = arr.length - 1;
        int tar = 3;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == tar) {
                System.out.println("Found: " + arr[mid] + " at index " + mid);
                break;
            }

            // Left half is sorted
            else if (arr[lo] <= arr[mid]) {
                if (arr[lo] <= tar && tar < arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
            // Right half is sorted
            else {
                if (arr[mid] < tar && tar <= arr[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
    }
}