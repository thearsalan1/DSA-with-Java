package Array;

import java.util.Scanner;

public class MultiplyBy2AndAddBy10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] y= new int[5] ;
        for (int i = 0; i < y.length; i++) {
            System.out.print("Enter the value of array at index at "+i+" =");
            y[i]=sc.nextInt();
        }
        for (int i = 0; i < y.length; i++) {
            if(i%2==0){
                y[i]*=2;
            }else{
                y[i]+=10;
            }
        }
        for (int i : y){
            System.out.println(i);
        }
    }
}
