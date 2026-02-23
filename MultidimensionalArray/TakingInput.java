package MultidimensionalArray;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] arr =new int[3][5];
//        TAKING INPUT
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

//        PRINTING
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
