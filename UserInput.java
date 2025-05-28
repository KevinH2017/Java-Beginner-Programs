import java.util.Scanner;  // Import the Scanner class to get user input

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);         // Creates Scanner object
        System.out.println("Enter text: ");           // Prompt to take user input

        String text = input.nextLine();                 // Waits for input from user in the next line and assigns it to String
        double value = input.nextDouble();              // Input must match variable type or InputMistmatchException error is thrown
        
        System.out.println("You entered: " + text);     // Outputs user input
        System.out.println(value);
    }
}