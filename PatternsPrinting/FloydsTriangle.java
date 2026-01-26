package PatternsPrinting;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of triangle");
        int n = sc.nextInt();
        int num =1;
        for (int i=1 ; i<n ; i++){
            for (int j =0 ; j<i ; j++){
                System.out.print(num+"\t");
                num++;
            }
            System.out.println();
        }
    }
}
