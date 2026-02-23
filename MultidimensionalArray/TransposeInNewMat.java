package MultidimensionalArray;

public class TransposeInNewMat {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,3,2},{4,5,6}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        int row = arr.length, col = arr[0].length;
        int[][] brr =new int[col][row];

        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[0].length; j++) {
                brr[i][j] = arr[j][i];
            }
        }
        System.out.println();
        for (int i = 0; i < brr.length; i++) {
            for (int j = 0; j < brr[0].length; j++) {
                System.out.print(brr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
