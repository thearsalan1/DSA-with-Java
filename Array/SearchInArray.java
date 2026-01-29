package Array;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Element=");
        int n =sc.nextInt();
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
        for (int i = 0; i < y.length; i++) {
            if(y[i]==n){
                System.out.println("Element found on index ="+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
