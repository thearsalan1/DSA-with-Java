package Recursion;

public class LookAndSay {
    public static String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1)+"#";
        String ans="";
        int i=0, j=0;
        while(j<s.length()){
            if(s.charAt(j)==s.charAt(i)) j++;
            else{
                int freq=j-i;
                ans+=freq;
                ans+=s.charAt(i);
                i=j;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(2));
    }
}
