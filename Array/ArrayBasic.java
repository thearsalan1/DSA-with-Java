package Array;

import java.util.Scanner;

public class ArrayBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = {6,19,7,28,26,16};
        System.out.println(x[1]);
        System.out.println(x[5]);

        int[] y= new int[5] ;
        for (int i = 0; i < y.length; i++) {
            System.out.print("Enter the value of array at index at "+i+" =");
            y[i]=sc.nextInt();
        }
        for (int j : y) {
            System.out.print(j);
        }
    }
}
