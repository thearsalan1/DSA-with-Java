package Array;

import java.util.Scanner;

public class PassingArrayToMethods  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] y= {45,55,66,77,77} ;
        System.out.println(y[4]);
        change(y);
    }

    public  static void change(int[] z){
        z[4]=90;
        System.out.println(z[4]);
    }
}
