package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 9, -3, 6, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = Integer.MAX_VALUE;
            int mindx=-1;
            for (int j = i; j < arr.length; j++) {
                if(min>arr[j]){
                    min=arr[j];
                    mindx=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[mindx];
            arr[mindx]=temp;
        }
        for(int ele : arr){
            System.out.print(ele+",");
        }

    }
}
