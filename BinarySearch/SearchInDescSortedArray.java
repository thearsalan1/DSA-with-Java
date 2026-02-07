package BinarySearch;

public class SearchInDescSortedArray {
    public static void main(String[] args) {
        int[] arr ={100,91,87,76,66,52,43,35,29,12,5};
        int tar=43;
        int lo=0,hi=arr.length-1;
        while(lo<=hi){
            int mid= (lo+hi)/2;
            if(arr[mid]==tar){
                System.out.println(arr[mid]);
                break;
            } else if (arr[mid]<tar) {
                hi=mid-1;
            }else{
                lo=mid+1;
            }
        }
    }
}
