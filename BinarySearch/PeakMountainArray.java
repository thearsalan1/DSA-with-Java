package BinarySearch;

public class PeakMountainArray {
    public static void main(String[] args) {
        int[] arr={-1,0,2,5,9,8,6,6,3};
        int lo=0, hi=arr.length-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if (arr[mid] < arr[mid + 1]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        System.out.println("Peak element: " + arr[lo]);
    }
}
