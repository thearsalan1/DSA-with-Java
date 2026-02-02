package Sorting;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = {1,2,9,3,4,5};
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<arr[i-1]){
                System.out.println("Array is not sorted");
                return;
            }
        }
        System.out.println("Sorted");
    }
}
