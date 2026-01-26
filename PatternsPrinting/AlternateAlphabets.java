package PatternsPrinting;

import java.util.Scanner;

public class AlternateAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number= ");
        int num = sc.nextInt();
        char ch='a';
        for (int i = 0; i < num; i++) {

            for (int j = 0 ; j<num ; j++){
                if(ch%2==0){
                    System.out.print(ch);
                }else {
                    System.out.print(Character.toUpperCase(ch));
                }

            }
            System.out.println();
            ch++;
        }
    }
}
