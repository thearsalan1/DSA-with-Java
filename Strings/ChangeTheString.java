package Strings;

public class ChangeTheString {
    public static void main(String[] args) {
        String match = "aBCD";
        char ch = match.charAt(0);
        if(ch>96){
            match=match.toLowerCase();
        }else {
            match=match.toUpperCase();
        }
        System.out.println(match);
    }
}
