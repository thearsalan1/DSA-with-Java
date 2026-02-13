package Strings;

public class SumOfSubstringInterger {

        public static int sumSubstrings(String s) {
            // code here
            int sum=0;
            for(int i = 0; i<s.length();i++){
                for (int j=i+1; j<=s.length(); j++){
                    String subStr = s.substring(i,j);
                    sum+=Integer.parseInt(subStr);
                }
            }
            return sum;
        }
    }
