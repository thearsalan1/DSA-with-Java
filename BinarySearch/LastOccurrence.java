package BinarySearch;

public class LastOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,5,5,6,6,7,7,8,8};
        int lo= 0, hi= arr.length-1;
        int idx=-1;
        int tar=6;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid]>tar){
                hi=mid-1;
            } else if (arr[mid]<tar) {
                lo=mid+1;
            }
            else {
                idx=mid;
                lo=mid+1;
            }
        }
        System.out.println(idx);
    }
}
