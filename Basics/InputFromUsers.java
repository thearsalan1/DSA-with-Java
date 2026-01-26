package Basics;

import java.util.Scanner;

public class InputFromUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double a = 2*3.14*x;
        System.out.println(a);

        double side= sc.nextDouble();
        double area = side*side;
        System.out.println("Area of the square= "+area);
    }

}
