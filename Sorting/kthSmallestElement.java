package Sorting;

public class kthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int k=4;
        for (int i = 0; i <k; i++) {
            int min = Integer.MAX_VALUE;
            int mindx=-1;
            for (int j = i; j < arr.length; j++) {
                if(arr[j]<min){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        System.out.println(arr[k-1]);
    }
}
