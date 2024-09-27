import java.util.Scanner;

public class MiddleCharacter {
    public static void main(String[] args) {
        //creating scanner object
        Scanner scanner = new Scanner(System.in);

        // variable declaration
        String word;
        int wordLength;

        // Display message and input
        System.out.print("Enter odd-length word : ");
        word = scanner.nextLine();

        // length declaration
        wordLength  = word.length();

        // check the input & output
        if (wordLength % 2 == 1) {

            int middleNumber;
            middleNumber = wordLength/2;
            System.out.println("The middle character is: " + word.charAt(middleNumber));

        } else {
            System.out.println("Enter valid word.");
        }
        scanner.close();
    }
}
