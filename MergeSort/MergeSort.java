package MergeSort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr={3,1,5,3,2,5,7,85,4};
        mergeSort(arr);
        for(int ele :arr) System.out.print(ele+" ");
    }

    private static void mergeSort(int[] arr) {
        int n=arr.length;

        if(n==1) return; // 1 length array is sorted
//        Create two empty arrays of size n/2
        int idx=0;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
//        copy-paste arr into a and b
        for (int i = 0; i < a.length; i++) {
            a[i]=arr[idx++];
        }
        for (int i = 0; i < b.length ; i++) {
            b[i]=arr[idx++];
        }
//        Magic
        mergeSort(a);
        mergeSort(b);
//        Merging a and b to single array
        merge(a,b,arr);
    }
    public static void merge(int[] a, int[] b, int[] c){
        int i=0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k++]=a[i++];
            }else{
                c[k++]=b[j++];
            }
        }
        while(i<a.length) c[k++]= a[i++];
        while(j < b.length) c[k++] = b[j++];
    }
}