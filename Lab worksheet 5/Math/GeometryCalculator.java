package hhh.Math;
import static hhh.Math.MathOperations.*;

public class GeometryCalculator {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        System.out.println("Value of static pi : " + mathOperations.getPi());
        System.out.println("area of a circle with a radius of 5 : " + calculateCircleArea(5));
        System.out.println("area of a square with a side length of 4 : " + calculateSquareArea(4));
    }
}