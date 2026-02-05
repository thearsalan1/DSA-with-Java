package Sorting;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {8, 4, 1, 9, -3, 6, 5};
        Arrays.sort(arr);
        int target = 20;
        int i=0;
        boolean flag=false;
        int j= arr.length-1;
        while(i<j){
            if (arr[i]+arr[j]>target){
                j--;
            }
            if(arr[i]+arr[j]<target){
                i++;
            }
            if(arr[i]+arr[j]==target){
                System.out.println("Two sum = "+arr[i]+" , "+arr[j]);
                flag=true;
                break;
            }
        }
        if(flag==false){
            System.out.println("No elements found");
        }
    }
}
