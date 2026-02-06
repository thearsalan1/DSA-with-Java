package BinarySearch;

import java.util.ArrayList;

public class firstAndLastOccr {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,5,5,6,6,7,7,8,8};
        ArrayList<Integer> arr1= new ArrayList<>();
        int lo=0, hi=arr.length-1;
        int fidx=-1,lidx=-1;
        int tar=6;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>tar) hi=mid-1;
            else if(arr[mid]<tar) lo=mid+1;
            else{
                fidx=mid;
                hi=mid-1;
            }
        }
        lo=0;
        hi=arr.length-1;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]>tar) hi=mid-1;
            else if(arr[mid]<tar) lo=mid+1;
            else{
                lidx=mid;
                lo=mid+1;
            }
        }
        arr1.add(lidx);
        arr1.add(fidx);
        System.out.println(arr1);
    }
}
