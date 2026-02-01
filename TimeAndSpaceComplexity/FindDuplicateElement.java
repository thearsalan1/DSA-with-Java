package TimeAndSpaceComplexity;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] arr= {5,1,3,4,2,4};

//        BRUTE FORCE APPROACH
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            for (int j = i+1; j < n ; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                    break;
                }
            }
        }

//        O(n^2) Time complexity

//        AVERAGE APPROACH
        boolean[] flag = new boolean[n+1];
        for (int ele : arr) {
            if (flag[ele]) {
                System.out.println(ele);
                break;
            } else flag[ele] = true;
        }

//        O(n) Time complexity but a new array created

//        OPTIMAL APPROACH
        int sum = n*(n-1)/2;
        int arrSum=0;
        for(int ele : arr){
            arrSum+=ele;
        }
        int num = arrSum-sum;
        System.out.println(num);

//       O(n) Time Complexity and no new array
    }
}
