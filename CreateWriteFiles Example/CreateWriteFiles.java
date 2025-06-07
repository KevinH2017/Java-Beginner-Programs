import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateWriteFiles {
    public static void main(String[] args) {
        // File will be created in the same location as this program
        File file = new File("text.txt");

        // BufferedWriter and FileWriter to write to text file
        // try-catch automatically closes the file after writing
        try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(file))) {
            buffWriter.write("Line One\n");     // Can take special characters
            buffWriter.write("Line Two");   
            buffWriter.newLine();                   // Same as \n
            buffWriter.write("Final Line");
            
        } catch (IOException e) {
            System.out.println("Unable to read file: " + file.toString());
        }  
    }
}
