package Recursion;

public class fibonacciNum {
    public static int feb(int n){
        if(n==0 || n==1) return n;
        return feb(n-1)+feb(n-2);
    }

    public static void main(String[] args) {
        System.out.println(feb(10));
    }
}
