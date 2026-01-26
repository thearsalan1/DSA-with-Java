package PatternsPrinting;

import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of side= ");
        int side = sc.nextInt();

        for(int i=0;i<side;i++){
            char ch ='A';
            for (int j=0; j<side;j++ ){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }

    }
}
