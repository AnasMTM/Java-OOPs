import java.util.Scanner;

public class LW2Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // method 1
        int number;

        do {
            System.out.print("Enter number : ");
            number = scanner.nextInt();

            int digits = 0;

            while ( number > 0 ){
                number = number / 10;
                digits++;
            }
            System.out.println("Digits : " + digits);
        }while (number >= 0 );

        /*
        // method 2

        int count =0;
        do {
            System.out.print("Enter an integer: ");
            number = scanner.nextInt();
            if (number == 0) {
                System.out.println("Number of Digits: 1");
            }else {
                while (number > 0) {
                    number = number / 10;
                    count++;
                }
                System.out.println("Number of Digits: "+count);
            }
            count = 0;
        }while (number >= 0);
        */
        scanner.close();
    }
}
