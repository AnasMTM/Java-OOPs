public class LW2Q1 {
    public static void main(String[] args) {
        // method 1
        for (int i = 10; i < 50; i++) {
            System.out.print(i + " ");
            if (i % 10 == 9) {
                System.out.println();
            }
        }
        /*
        // method 2

        for (int i = 10; i < 50; i = i + 10){
            for (int j = 0; j < 10;j++){
                System.out.print(i + j + " ");
            }
            System.out.println();
        }
        // method 3

        for (int i = 1; i <5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((i*10) + j + " ");
            }
            System.out.println();
        }
        */
    }
}
