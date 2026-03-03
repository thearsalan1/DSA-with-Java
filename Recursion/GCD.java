package Recursion;

public class GCD {
    public static int GCD(int a,int b){
//        int gcd=1;
//        for (int i = 1; i <= a; i++) {
//            if(a%i==0 && b%i==0){
//                if(i>gcd){
//                    gcd=i;
//                }
//            }
//        }
//        return gcd;

        if(a==0) return b;
        return GCD(b%a,a);
    }

    public static void main(String[] args) {
        System.out.println(GCD(10,20));
    }
}
