package handle2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandlingExceptions2 {
    public static void main(String[] args) {
        File file = new File("test.txt");

        // Exceptions must be handled
        try {
            FileReader reader = new FileReader(file);

            // This will not run if FileNotFoundException is caught
            System.out.println("Processing...");
        // Never let the user see the stack trace, create an error message
        } catch (FileNotFoundException e) {
            System.out.println("Error, file not found: " + file.toString());
        }
        System.out.println("Finished!");   
    }
}