package com.dz;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("Input the color, the filled and the radius of the circle: ");
        Scanner sc = new Scanner(System.in);
        Circle ob1 = new Circle(sc.next(),sc.nextBoolean(),sc.nextDouble());
        System.out.print(ob1.toString());
        System.out.println("\nInput the color, the filled, the width and the length of the rectangle: ");
        Rectangle ob2 = new Rectangle(sc.next(),sc.nextBoolean(),sc.nextDouble(),sc.nextDouble());
        System.out.print(ob2.toString());
        System.out.println("\nInput the color, the filled, the side of the square: ");
        Square ob3 = new Square(sc.next(),sc.nextBoolean(),sc.nextDouble());
        System.out.print(ob3.toString());
    }
}
