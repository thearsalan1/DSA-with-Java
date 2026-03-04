package Recursion;

import java.util.ArrayList;

import static Array.PassingArrayToMethods.change;

public class StringBasicMore {
    public static void main(String[] args) {
        String s = "Arsalan";
        change(s);
        System.out.println(s);

        String[] arr= {"Hannan", "Hammad", "Arsalan"};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add(0,"Azka");
        arr1.add("Sab");
        System.out.println(arr1);

        change2(arr1);
        System.out.println(arr1);
    }
    public static void change(String i){
        i="Azka";
    }

    public static void change2(ArrayList<String> arr1){
        arr1.add("Arsalan");
    }
}
