package BinarySearch;

public class kthMissingElement {
    public int kthMissing(int[] arr, int k) {
        // code here
        int lo = 0, hi = arr.length-1;
        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            int currentIdx = mid+1;
            int missEle = arr[mid]-currentIdx;
            if(missEle>=k) hi=mid-1;
            else lo=mid+1;
        }
        return hi+1+k;
    }
}
