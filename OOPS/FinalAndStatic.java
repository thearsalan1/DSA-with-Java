package OOPS;

class Cricketer{
    final String country= "India";
    int run;
    String name;
    double avg;
    void print(){
        System.out.println(run+" "+name+" "+avg);
    }
    static void greet(){
        System.out.println("Azka");
    }
}

public class FinalAndStatic {
    public static void main(String[] args) {
        Cricketer me = new Cricketer();
        System.out.println(me.country);
//        me.country="Pakistan"; // Never Never XX
        Cricketer.greet();
        me.print();
    }
}
