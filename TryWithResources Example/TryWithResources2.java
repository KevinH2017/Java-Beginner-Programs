import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources2 {
    public static void main(String[] args) {
        File file = new File("text.txt");

        // Combines FileReader and BufferedReader into one constructor for try-catch block
        // This makes it easier to read and much cleaner
        try (BufferedReader buffReader = new BufferedReader(new FileReader(file))) {

            // Reads file line by line
            String text;
            while ((text = buffReader.readLine()) != null) {
                System.out.println(text);
            }

        }  catch (FileNotFoundException e) {
            System.out.println("Cannot find file: " + file.toString());
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }
    }
}
