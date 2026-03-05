package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(4,'A','B','C');
    }

    private static void hanoi(int n, char src, char helper, char dest) {
        if(n==0){
            return;
        }
        // n-1 disk from A to B via C
        hanoi(n-1,src,dest,helper);
        // Largest from A to C
        System.out.println(src+"->"+dest);
        //n-1 disks from B to C via A
        hanoi(n-1,helper,src,dest);
    }

}
