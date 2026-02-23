package MultidimensionalArray;

public class ForEach {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3,4},{4,5,6}};
        for (int i = 0; i < arr.length; i++) {
            for(int ele : arr[i]){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
        for(int[] a : arr){
            for(int ele :a ){
                System.out.print(ele);
            }
        }
    }
}
