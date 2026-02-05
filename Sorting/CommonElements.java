package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr = {3,1,2,1,1,4,5,5};
        int[] arr2 = {6,1,1,4,4,2,8};
        Arrays.sort(arr);
        Arrays.sort(arr2);
        int i=0, j=0;
        ArrayList<Integer> finalArr = new ArrayList<>();
        while(i<arr.length && j<arr2.length){
            if(arr[i]==arr2[j]){
                finalArr.add(arr[i]);
                j++;
                i++;
            }
            else if(arr[i]>arr2[j]){
                j++;
            }
            else if(arr[i]<arr2[j]){
                i++;
            }
        }
        if(finalArr.isEmpty()){
            System.out.println("No common elements found");
        } else {
            System.out.println("Common elements: " + finalArr);
        }

    }
}
