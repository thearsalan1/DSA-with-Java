package Array;

public class Segregate0sAnd1s {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,0,1};

//        TWO PASS NOT MORE EFFICIENT
//        int noOf0=0;
//        for(int ele : arr){
//            if(ele==0) noOf0++;
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(noOf0>0){
//                arr[i]=0;
//                noOf0--;
//            }else {
//                arr[i]=1;
//            }
//        }
//        for (int ele : arr){
//            System.out.print(ele+" ");
//        }

//        TWO POINTER APPROACH MORE EFFICIENT
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]==0) i++;
            else if(arr[j]==1) j--;
            else if(arr[i]==1 && arr[j]==0){
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }
        }
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
