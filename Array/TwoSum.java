package Array;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr= {2,3,8,-3};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j]==5){
                    System.out.println(i+","+j);
                }
            }
        }
    }
}
