package PatternsPrinting;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int n= sc.nextInt();
        for (int i = 0; i < 2*n+1; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < n ; i++) {
            for (int j = n; j >i; j--) {
                System.out.print("-");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >i; j--) {
                System.out.print("-");
            }
            System.out.println();
        }
    }
}
