package Recursion;

public class RecOnArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println(exists(arr,9,0));
        recPrint(arr,0);
    }

    public static int recPrint(int[] arr, int idx){
        if(idx==arr.length) return 0;
        System.out.println(arr[idx]);
        return recPrint(arr,idx+1);
    }

    public static boolean exists(int[] arr , int num, int idx){
        if(arr[idx]==num){
            return true;
        }
        if(idx>=arr.length-1) return false;
        return exists(arr,num,idx+1);
    }
}
