package handle3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class HandleingExceptions3 {
    public static void main(String[] args) {
        try {
            openFile();
        // Never let the user see the stack trace, create a detailed error message
        } catch (FileNotFoundException e) {
            System.out.println("Error, file not found!");
        }
    }

    // Exceptions must be handled
    public static void openFile() throws FileNotFoundException{
        File file = new File("test.txt");
        FileReader reader = new FileReader(file);
    }
}
