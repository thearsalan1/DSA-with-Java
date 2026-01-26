package PatternsPrinting;

import java.util.Scanner;

public class NumberSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number you want to repeat= ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            for (int j = 0; j <num; j++){
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
}
