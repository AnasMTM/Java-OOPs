import java.util.Scanner;

public class Circle {
    // variable declaration
    private double vRadius;

    // getMethod
    public double getRadius(){
        return vRadius;
    }

    // setMethod
    public void setRadius(double argRadius){
        this.vRadius = argRadius;
    }

    // Create main method
    public static void main(String[] args) {
        // Object creation
        Scanner scanner = new Scanner(System.in);
        Circle outerCircle = new Circle();
        Circle innerCircle = new Circle();

        // Variable Declaration
        double ro;
        double outerArea;
        double outerCircumference;
        double ri;
        double innerArea;
        double innerCircumference;

        // Display message and input
        System.out.print("Enter outer radius: ");
        ro = scanner.nextDouble();
        outerCircle.setRadius(ro);

        // calculate outer area and circumference
        outerArea = outerCircle.computeArea();
        outerCircumference = outerCircle.computeCircumference();

        // Display message and input
        System.out.print("Enter inner radius: ");
        ri = scanner.nextDouble();
        innerCircle.setRadius(ri);

        // calculate inner area and circumference
        innerArea = innerCircle.computeArea();
        innerCircumference = innerCircle.computeCircumference();

        // output
        System.out.println("Outer Circumference: " + outerCircumference);
        System.out.println("Inner Circumference: " + innerCircumference);
        System.out.println("Difference in Areas: " + (outerArea - innerArea));

        scanner.close();
    }

    // Create computeArea method
    public double computeArea() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

    // Create computeCircumference method
    public double computeCircumference() {
        return 2 * Math.PI * this.getRadius();
    }
}
