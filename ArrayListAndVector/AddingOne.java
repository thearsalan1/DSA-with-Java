package ArrayListAndVector;

import java.util.ArrayList;
import java.util.Arrays;

public class AddingOne {
    public static void main(String[] args) {
        int[] arr = {9, 8, 8};
        int n = arr.length;
        int carry = 1; // start with +1

        for (int i = n - 1; i >= 0; i--) {
            int sum = arr[i] + carry;
            arr[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] newArr = new int[n + 1];
            newArr[0] = carry;
            for (int i = 0; i < n; i++) {
                newArr[i + 1] = arr[i];
            }
            arr = newArr;
        }

        System.out.println(Arrays.toString(arr));
    }
}