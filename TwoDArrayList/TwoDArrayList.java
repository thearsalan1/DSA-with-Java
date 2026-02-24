package TwoDArrayList;

import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(2); a.add(3);a.add(4);a.add(4);a.add(5);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(30); b.add(28);b.add(38);b.add(99);b.add(90);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(12); c.add(23);c.add(34);c.add(44);c.add(55);

        arr.add(a); arr.add(b); arr.add(c);

        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }

        for(ArrayList<Integer> List : arr){
            for (int ele : List){
                System.out.print(ele+" ");
            }
            System.out.println( );
        }
    }
}
