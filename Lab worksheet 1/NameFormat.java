import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        //creating scanner object
        Scanner scanner = new Scanner(System.in);

        // variable declaration
        String fullName;
        String[] nameSeparate;

        // Display message and input
        System.out.print("Enter full name in the format first middle last : ");
        fullName = scanner.nextLine();

        // name separation by space
        nameSeparate = fullName.split(" ");

        // name checking and output
        if (nameSeparate.length == 3){
            String last = nameSeparate[2];
            String firstMiddle = nameSeparate[0];
            String initial = String.valueOf(nameSeparate[1].charAt(0));

            System.out.println(last + ", " + firstMiddle + " " + initial);
        }
        else {
            System.out.println("Enter name with valid format.");
        }

        // closing scanner object
        scanner.close();
    }
}
