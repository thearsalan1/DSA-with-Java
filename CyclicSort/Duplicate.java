package CyclicSort;

public class Duplicate {
    public static void main(String[] args) {
        int[] arr= {1,3,5,3,7,8,4};
        find(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]==arr[i+1]){
                System.out.println("Duplicate: " + arr[i]);
            }
        }
    }
    public static int[] find(int[] a){

        int i=0;
        while(i<a.length){
            int idx=a[i] -1;
            if(a[i]!=idx+1){
                swap(a,i,idx+1);
            }else{
                 i++;
            }
        }
        return a;
    }
    public static void swap(int[] a,int i , int idx){
        int temp = a[i];
        a[i] = a[idx];
        a[idx] =temp;
    }
}
