package PatternsPrinting;

import java.util.Scanner;

public class VerticalFlippedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows you want");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            for (int j = n; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
