package hhh.Math;

public class AreaCalculator {
    public static double calculateRectangleArea(double length, double width){
        return length * width;
    }
    public static double calculateSquareArea (double sideLength){
        return sideLength * sideLength;
    }
    public static void main(String[] args) {
        AreaCalculator areaCalculator = new AreaCalculator();
        System.out.println("area of a rectangle with a length of 5 and width of 8 : " + calculateRectangleArea(5,8));
        System.out.println("area of a square with a side length of 4 : " + calculateSquareArea(4));
    }
}
