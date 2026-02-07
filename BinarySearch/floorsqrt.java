package BinarySearch;

public class floorsqrt {
    public static void main(String[] args) {
        int n=20;
        int x=15;
        int lo=0,hi=20;
        int root=-1;
        while(lo<=hi){
            int mid= (lo+hi)/2;
            if(mid*mid==x) {
                System.out.println(mid);
                break;
            }
            else if (mid*mid>x)hi=mid-1;
            else{
                root=mid;
                lo=mid+1;
            }
        }
        System.out.println(root);
    }
}
