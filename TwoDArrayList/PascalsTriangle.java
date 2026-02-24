package TwoDArrayList;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0 ; i<n; i++){
            ans.add(new ArrayList<>());
            for (int j = 0; j <= i; j++) {
                if(j==0 || j==i) {
                    ans.get(i).add(1);
                }
                else{
                    int val = ans.get(i-1).get(j) + ans.get(i-1).get(j-1);
                    ans.get(i).add(j,val);
                }
            }
        }
        return ans;

        public List<List<Integer>> Twogenerate(int numRows) {
            List<List<Integer>> res=new ArrayList<>();
            for(int i=0;i<numRows;i++)
            {
                List<Integer> cum=new ArrayList<>();
                for(int j=0;j<=i;j++)
                {
                    if(j==0||j==i)
                    {
                        cum.add(1);
                    }
                    else
                    {
                        cum.add(res.get(i-1).get(j-1)+ res.get(i-1).get(j));
                    }
                }
                res.add(cum);
            }
            return res;
        }
    }
}
