package OOPS;

class Mobile{
    String Model;
    int Ram;
    int Rom;
    String Processor;
    Mobile(String Model,int Ram,int Rom,String Processor){
        Model=Model;
        Ram= Ram;
        Rom= Rom;
        Processor=Processor;
    }
    void print(){
        System.out.println(Model+Ram+Rom+Processor);
    }
}

public class Constructor {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Note 10s",6,128,"Helio G95");
        m1.print();
    }
}
