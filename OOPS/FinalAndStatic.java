package OOPS;

class Cricketer{
    final String country= "India";
    int run;
    String name;
    double avg;
}

public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer me = new Cricketer();
        System.out.println(me.country);
//        me.country="Pakistan"; // Never Never XX 

    }
}
