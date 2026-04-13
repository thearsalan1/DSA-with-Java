package OOPS;

public class This {
    public static class Car{
        private  int price;
        private String name;
        Car(String name ,int price) {
            this.name = name;
            this.price = price;
        }
    }

    public static void main(String[] args) {
        Car Tata = new Car("Punch" , 600000);
        System.out.println("Price of the car "+Tata.name+" is "+Tata.price);
    }
}
