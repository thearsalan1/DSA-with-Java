package Sorting;

public class SelectionSortReverse {
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 9, -3, 6, 5};
        int n = arr.length-1;
        for(int i= n; i>=0; i--){
            int max = Integer.MIN_VALUE;
            int maxdx=-1;
            for (int j = i; j >= 0; j--) {
                if(max<arr[j]){
                    max=arr[j];
                    maxdx=j;
                }
            }
            int temp = arr[i];
            arr[i]=max;
            arr[maxdx]=temp;
        }
        for(int ele : arr){
            System.out.print(ele+",");
        }
    }
}
