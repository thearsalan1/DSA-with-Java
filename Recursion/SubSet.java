package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        String s = "abc";
        List<String> list = new ArrayList<>();
        subSet("",s,0,list);
        System.out.println(list);
    }

    private static void subSet(String ans, String s1, int idx,List<String> list) {
        if(idx==s1.length()) {
            if(ans.length()!=0) list.add(ans);
            return;
        }
        char ch = s1.charAt(idx);
        subSet(ans,s1,idx+1,list);//skip;
        subSet(ans+ch,s1,idx+1,list); // Pick
    }
}
