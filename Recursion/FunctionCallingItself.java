package Recursion;

public class FunctionCallingItself {
    public static void main(String[] args) {
        arsalan(1);
    }
    public static void arsalan(int n){
        if(n==10) return;
        System.out.println("Arsalan");
        arsalan(n+1);
    }
}
