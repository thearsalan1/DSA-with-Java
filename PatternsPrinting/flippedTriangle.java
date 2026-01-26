package PatternsPrinting;

import java.util.Scanner;

public class flippedTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows");

        int n = sc.nextInt();

        for (int i=n;i>0 ;i--){
            char ch ='a';
            for(int j=0;j<i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();

        }
    }

}
