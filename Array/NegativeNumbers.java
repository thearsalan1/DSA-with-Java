package Array;

import java.util.Scanner;

public class NegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] y= new int[5] ;
        for (int i = 0; i < y.length; i++) {
            System.out.print("Enter the value of array at index at "+i+" =");
            y[i]=sc.nextInt();
        }
        for (int j : y) {
            if(j<0){
                System.out.print(j+" ");
            }
        }
    }
}
