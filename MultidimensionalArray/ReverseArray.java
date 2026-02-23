package MultidimensionalArray;

public class ReverseArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,3,2},{4,5,6}};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = arr[i].length-1; j >= 0; j--) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
