package TwoDArrayList;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        int n = rowIndex+1;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0 ; i<=n ; i++){
            list.add(new ArrayList<>());
            for(int j=0 ; j<=i ; j++){
                if(j==0 || j==i) {
                    list.get(i).add(1);
                }else{
                    int val = list.get(i-1).get(j) + list.get(i-1).get(j-1);
                    list.get(i).add(j,val);
                }
            }
        }
        return list.get(rowIndex);
    }
}
