package BinarySearch;

public class FloorInASortedArray {
    public int findFloor(int[] arr, int x) {
        int lo=0,hi=arr.length-1;
        int idx=-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>x) hi=mid-1;
            else{
                idx=mid;
                lo=mid+1;
            }
        }
        return idx;
    }

}

