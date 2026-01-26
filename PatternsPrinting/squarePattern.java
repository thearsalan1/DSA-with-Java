package PatternsPrinting;

import java.util.Scanner;

public class squarePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of side= ");
        int side = sc.nextInt();
        for (int i=0;i<side;i++){
            for(int j = 0 ; j < side ; j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
