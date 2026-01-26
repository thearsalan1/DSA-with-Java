package PatternsPrinting;

import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows");
        int n = sc.nextInt();

        for (int i=0; i<n;i++){
            char ch='A';
            for (int j=0 ;j<=i;j++){
                if(i%2==0){
                    System.out.print(j+1);
                }else {
                    System.out.print(ch);
                }
                ch++;
            }
            System.out.println();

        }
    }
}
