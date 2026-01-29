package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] y= new int[5] ;
        for (int i = 0; i < y.length; i++) {
            System.out.print("Enter the value of array at index at "+i+" =");
            y[i]=sc.nextInt();
        }
        int max=0;
        for (int j : y) {
            if(max<j){
                max=j;
            }
        }
        System.out.println(max);
        System.out.println(Integer.MIN_VALUE);
    }
}
