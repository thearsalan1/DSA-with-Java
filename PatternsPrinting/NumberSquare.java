package PatternsPrinting;

import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digits= ");
        int dig= sc.nextInt();
        for (int i=0 ;i<dig; i++){
            for (int j=0 ; j<dig ; j++){
                System.out.print(j+1+"\t");
            }
            System.out.println();
        }
    }
}
