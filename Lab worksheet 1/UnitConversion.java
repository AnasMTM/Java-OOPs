import java.util.Scanner;

public class UnitConversion {
    public static void main(String[] args) {
        //creating scanner object
        Scanner scanner = new Scanner(System.in);

        // variable declaration
        float centimeter;
        float convertToInch;
        float inches;
        int feet;

        // Display message and input
        System.out.print("Enter number of centimeter : ");
        centimeter = scanner.nextFloat();

        // centimeter to inch conversion
        convertToInch = (float)(centimeter/2.54);

        // unit separation feet and inches
        feet = (int) convertToInch / 12;
        inches = convertToInch % 12;

        //  output
        System.out.println(feet + " feet and " + inches + " inches");

        // closing scanner object
        scanner.close();
    }
}
