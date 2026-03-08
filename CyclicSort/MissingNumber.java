package CyclicSort;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,3,5,6,2};
        find(arr);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
    public static int[] find(int[] a){
        int n=a.length;
        int i=0;
        while(i<n){
            int currentIndex=a[i];
            if(a[i]<a.length && a[i] != a[currentIndex]){
                int temp = a[i];
                a[i]=a[currentIndex];
                a[currentIndex] = temp;
            }else {
                i++;
            }
        }
        return a;
    }

}
