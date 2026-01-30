package Array;

public class MissingInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,0};
        int n = arr.length+1;
        boolean flag=false;
        int num=0;
        for (int i = 0; i <= n-1; i++) {
            for (int j = 0; j <= n-1; j++) {
                if(i==arr[j]){
                    flag=true;
                }else{
                    num=i;
                    flag=false;
                    break;
                }
            }
        }
        if(flag){
            System.out.println("All elements are present");
        }else{
            System.out.println(num);
        }
    }
}
