package BinarySearch;

public class firstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,5,5,6,6,7,7,8,8};
        int target=4;
        int lo=0 , hi = arr.length-1;
        int ind=-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==target){
                ind=mid;
                hi=mid-1;
            } else if (arr[mid] > target) {
                hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(ind+" : "+arr[ind]);
    }
}
