package BinarySearch;

public class ReverseSortedArray {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,4,3,2,1,0};
        int lo=0;
        int hi=arr.length-1;
        boolean flag=false;
        int tar= 0, idx=-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            if(arr[mid]==tar){
                flag=true;
                idx=mid;
                break;
            } else if (arr[mid]>tar) {
                lo=mid+1;
            } else {
                hi=mid-1;
            }
        }
        if(flag) System.out.println("Element found: "+idx);
        else System.out.println("Element not found");
    }
}
