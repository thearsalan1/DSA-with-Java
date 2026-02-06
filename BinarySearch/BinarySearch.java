package BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-76,-56,-10,0,2,20,35,77,90};
        int n=arr.length-1;
        int low = 0;
        int high=n;
        int tar=77;
        boolean flag=false;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>tar) high= mid-1;
            else if (arr[mid]<tar) low=mid+1;
            else if (arr[mid]==tar){
                flag=true;
                break;
            }
        }
        if(flag) System.out.println("Element found");
        else System.out.println("Element not found");
    }
}
