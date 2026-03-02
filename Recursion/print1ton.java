package Recursion;

import java.util.Scanner;

public class print1ton {
    static int x;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        print(x);
    }
    public static void print(int i){
        if(i==0) return;
        print(i-1);
        System.out.println(i+" ");

    }
}
