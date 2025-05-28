import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* Bloated while loop
        System.out.println("Enter a number: (0-9) ");
        int value = scanner.nextInt();

        while(value != 5) {
            System.out.println("Enter another number: (0-9) ");
            value = scanner.nextInt();
        }
        */

        // Initialize value outside of loop
        int value;

        // Do-While will always run at least once
        do {
            System.out.println("Enter a number: (0-9) ");
            value = scanner.nextInt();
        } while(value != 5);

        System.out.println("Got 5!");
    }
}