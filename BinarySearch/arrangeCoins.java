package BinarySearch;

public class arrangeCoins {
    public static int sqrt(long n){
        if(n==0) return 0;
        long lo=0,hi=n;
        while(lo<=hi){
            long mid= lo+(hi-lo)/2;
            if(mid==n/mid) return (int)mid;
            else if(mid<n/mid) lo=mid+1;
            else hi=mid-1;
        }
        return (int)hi;
    }

    public static int arrangeCoin(int n){
        long m = n;
        return (sqrt(8*m+1)-1)/2;
    }

    public static   void main(String[] args) {
        int c=arrangeCoin(13);
        System.out.println(c);
    }
}
