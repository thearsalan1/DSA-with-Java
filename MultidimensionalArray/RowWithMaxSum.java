package MultidimensionalArray;

public class RowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{1,2,3,4},{4,5,6}};

        int maxSum=0;
        int idx=-1;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = 0; j < arr[0].length; j++) {
                sum+=arr[i][j];
            }
            if(sum>maxSum){
                idx=i;
                maxSum=sum;
            }
        }
        System.out.println(idx);
    }
}
