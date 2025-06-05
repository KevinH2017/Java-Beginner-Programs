import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        File file = new File("text.txt");
        BufferedReader buffReader = null;                              // Creates BufferedReader object with null value for .close() method

        try {
            FileReader reader = new FileReader(file);                  // Requires FileNotFoundException
            buffReader = new BufferedReader(reader);

            String text;
            // Keeps printing lines until the end
            while ((text = buffReader.readLine()) != null) {
                System.out.println(text);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File " + file.toString() + " not found.");
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        } finally {
            // finally block will always execute after the try-catch no matter what
            try {
                buffReader.close();
            } catch (IOException e) {
                System.out.println("Unable to close file: " + file.toString());
            } catch (NullPointerException e) {
                // Runs when a trying to access a null object
                e.getStackTrace();
            }
        }


    }
}
