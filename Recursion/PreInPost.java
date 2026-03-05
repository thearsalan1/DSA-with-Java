package Recursion;

public class PreInPost {
    public static void main(String[] args) {
        pip(3);
    }
    public static void pip(int n){
        if(n==0) return;
        System.out.println("Pre"+" ");
        pip(n-1);
        System.out.println("In"+" ");
        pip(n-1);
        System.out.println("POST"+" ");
    }
}
