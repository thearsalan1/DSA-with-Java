package Sorting;

public class BubbleMoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();

        int j=0;
        for (int i = 0; i < n ; i++) {
            if(arr[i]!=0){
                if(i!=j){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                j++;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }


    }
}
