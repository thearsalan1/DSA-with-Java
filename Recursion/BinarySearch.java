package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,7,8};
        int n=nums.length;
        int tar=0;
        System.out.println(helper(nums,tar,0,n-1));
    }
    public static  int helper(int[] nums, int tar , int lo, int hi){
        if(lo>hi) return -1;
        int mid = lo+ (hi-lo)/2;
        if(nums[mid]==tar) return mid;
        else if(nums[mid]>tar) return helper(nums,tar,lo,mid-1);
        else return helper(nums,tar,mid+1,hi);
    }
}
