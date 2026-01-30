package Array;

import java.util.Scanner;

public class ImpRotateArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rotations : ");
        int d = sc.nextInt();
        d%=n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void reverse(int[] arr, int i , int j){
        while (i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
