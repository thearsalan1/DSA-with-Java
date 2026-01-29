package Array;

import java.util.Scanner;

public class SecondMaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {45,45, 66, 28, 16, 26};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secMax = max;
                max=arr[i];
            }
        }
        System.out.println("Max= "+max);
        System.out.println("Second Max= "+secMax);
    }
}
