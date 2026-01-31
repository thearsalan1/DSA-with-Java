package Array;

public class WaveArray {
    public static void main(String[] args) {
        int[] arr= {2,4,7,8,9,10};
        int i=0;
        int j=i+1;
        while(j<arr.length){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i+=2;
            j+=2;
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
