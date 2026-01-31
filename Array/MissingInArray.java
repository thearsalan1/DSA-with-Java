package Array;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,8,9,10};
        int n= 10;
        int sum= n*(n+1)/2;
        int s= 0;
        for(int ele : arr){
            s+=ele;
        }
        int num=sum-s;
        System.out.println(num);
    }
}
