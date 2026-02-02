package Sorting;

public class BubbleSortingInDescOrder {
    public static void main(String[] args) {
        int[] arr = {4,3,5,1,54,7};
        int n = arr.length-1;
        for (int i = 0; i < n ; i++) {
            int swap = 0;
            for (int j = 0; j < n; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            if(swap == 0) break;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
