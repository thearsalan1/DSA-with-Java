package PatternsPrinting;

import java.util.Scanner;

public class VerticallyFlippedAlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of length");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num=1;
            for (int j = n; j > i+1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }
}
