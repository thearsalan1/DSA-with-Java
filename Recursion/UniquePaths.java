package Recursion;

public class UniquePaths {
    public static int UniquePaths(int m, int n){
        if(m==1 || n==1) return 1;
        return UniquePaths(m,n-1)+UniquePaths(m-1,n);
    }

    public static void main(String[] args) {
        int paths= UniquePaths(3,4);
        System.out.println(paths);
    }
}
