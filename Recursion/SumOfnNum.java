package Recursion;

public class SumOfnNum {
    public static int sum(int num){
        if(num==0){
            return num;
        }
        return num+sum(num-1);

    }

    public static void main(String[] args) {
        System.out.println(sum(5));

    }
}
