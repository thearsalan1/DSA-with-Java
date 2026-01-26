package PatternsPrinting;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int n= sc.nextInt();
        System.out.println("Enter the number of columns");
        int m=sc.nextInt();
        for (int i=1 ;i<=n; i++){
            for (int j=1 ;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*\t");
                }else {
                    System.out.print(" \t");
                }

            }
            System.out.println();
        }

    }
}
