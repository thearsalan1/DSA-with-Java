package PatternsPrinting;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in pyramid");
        int n=sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i+1 ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
