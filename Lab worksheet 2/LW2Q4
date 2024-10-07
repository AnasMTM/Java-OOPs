import java.util.Scanner;

public class LW2Q4 {
    public static void main(String[] args) {
        // creating a scanner object
        Scanner scanner = new Scanner(System.in);

        // method 1 for get second large number

        // declaring variables
        int largest = 0;
        int secLargest = 0;
        int[] numbers= new int[5];

        // for loop for get input
        for (int i = 0; i < 5; i++){
            System.out.print("Enter number " + (i + 1) + " : ");
            numbers[i] = scanner.nextInt();
        }

        // for loop and if condition for get second large number
        for (int i = 0; i < 5; i++){
            if (largest < numbers[i]) {
                    secLargest = largest;
                    largest = numbers[i];
            }else if (secLargest < numbers[i]){
                    secLargest = numbers[i];
                }
            }

        // output
        System.out.println("The second largest number is : " + secLargest);

        /*
        // method 2 for get second large number

        // for loop and if condition for get second large number
        int[] reorderNumber = new int[5];
        int index = 0;
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++) {
                if (reorderNumber[i] < numbers[j]) {
                    reorderNumber[i] = numbers[j];
                    index = j;
                }
            }
            numbers[index] = 0;
        }
        // output
        System.out.println("The second largest number is : " + reorderNumber[1]);
        */

        // close the object
        scanner.close();
    }
}
