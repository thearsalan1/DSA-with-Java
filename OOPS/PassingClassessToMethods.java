package OOPS;

public class PassingClassessToMethods {
    public static class Car{
        int noOfSeats;
        String name;
        double length;
        String type;

        void print(){
            System.out.println(noOfSeats+" "+name+" "+length+" "+type);
        }
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.length=3.99;
        c.name="Kia Sonet";
        c.type="Suv";
        c.noOfSeats=5;
        c.print();
        change(c);
        System.out.println(c.noOfSeats);
    }
    private static void change(Car c){
        c.noOfSeats=4;
    }
}
