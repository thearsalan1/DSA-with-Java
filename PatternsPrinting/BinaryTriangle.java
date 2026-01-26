package PatternsPrinting;

import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of triangle");
        int n= sc.nextInt();
        int num =1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <i; j++) {
                if((i+j)%2==0){
                    System.out.print(1+" ");
                }else {
                    System.out.print(0 + " ");
                }
            }

            System.out.println();
        }
    }
}
