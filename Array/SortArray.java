package Array;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] y= {1,6,9,7,9} ;
        Arrays.sort(y);
        for(int j:y){
            System.out.println(j);
        }
    }
}
