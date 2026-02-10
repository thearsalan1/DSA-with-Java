package BinarySearch;

public class searchInSortedAndRotatedArr {
    public static void main(String[] args) {
        int n = 9;
        int[] arr = {5,6,7,8,9,10,1,2,3};
        int k = 10;

        int lo=0,hi=n-1;
        while(lo<=hi){
            int mid= lo+(hi-lo)/2;
            if(arr[mid]==k) {
                System.out.println(arr[mid] + " : " + k);
                break;
            }
            else if(arr[mid]<k) lo=mid+1;
            else hi=mid-1;
        }
    }
}
