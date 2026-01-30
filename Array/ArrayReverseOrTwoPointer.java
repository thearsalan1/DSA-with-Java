package Array;

public class ArrayReverseOrTwoPointer {
    public static void main(String[] args) {
        int[] arr= {6,5,4,8,8,7};
        int temp=0;
        int start = 0;
        int end = arr.length-1;
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        while(start<end){
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
