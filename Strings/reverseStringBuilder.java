package Strings;

public class reverseStringBuilder {
    public static void main(String[] args) {
        String s = "Mohd Arsalan";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        int i=0,j=sb.length()-1;
        while(i<=j){
            char temp1 = sb.charAt(i);
            char temp2= sb.charAt(j);
            sb.setCharAt(i,temp2);
            sb.setCharAt(j,temp1);
            j--;
            i++;
        }
        System.out.println(sb);

        String sc = "Mobile";
        StringBuilder t = new StringBuilder(sc);
        t.reverse();
        sc= t.toString();
        System.out.println(sc);
    }
}
