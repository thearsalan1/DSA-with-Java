package PatternsPrinting;

import java.util.Scanner;

public class starPlus {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the length of star= ");
        int n= sc.nextInt();
        int middle= (int)Math.ceil(n/2.0);
        for (int i=0; i<n ; i++){
            for(int j=0; j<n;j++){
                if(i==middle-1 || j==middle-1){
                    System.out.print("*\t");
                }else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
