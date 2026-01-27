package PatternsPrinting;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int nsp=n-1;
        int nst=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nst; j++) {
                System.out.print("*");
            }
            nsp-=1;
            nst+=2;
            System.out.println();
        }
        
        nsp=1;
        nst=(2*n)-3;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < nsp; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < nst; j++) {
                System.out.print("*");
            }
            System.out.println();
            nsp+=1;
            nst-=2;
        }
    }
}
