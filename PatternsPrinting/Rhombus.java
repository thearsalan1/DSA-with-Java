package PatternsPrinting;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of side:");
        int side = sc.nextInt();
        for (int i = 0; i < side; i++) {
            for (int j = side; j > i+1; j--) {
                System.out.print(" \t");
            }
            for (int j = 0; j < side; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
