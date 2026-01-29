package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] y= {54,97,56,38,79,10} ;
        int[] x=y; //x is the shallow copy of y
        x[0]=100;
        System.out.println(y[0]);

        int[] deep = Arrays.copyOf(x,x.length); // deep copy
        deep[0]=50;
        System.out.println(deep[0]);
        System.out.println(x[0]);
    }
}
