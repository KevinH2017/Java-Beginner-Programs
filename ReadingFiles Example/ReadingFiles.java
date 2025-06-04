// Uses File and Path classes to read files
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        // File to read
        String filename = "test.txt";

        // Creates file object from filepath
        // Uses File class to create object for Scanner class
        // System.getProperty to get current working directory
        File file = new File(System.getProperty("user.dir") + "/" + filename);      // Needs "/" to read file location
        Scanner fileScan = new Scanner(file);

        // Finds the next Integer in the file
        int num = fileScan.nextInt();
        System.out.println("Integer value: " + num);
        fileScan.nextLine();

        int count = 0;
        // Prints out each line of the file
        while (fileScan.hasNextLine()) {
            String text = fileScan.nextLine();
            System.out.println("Line " + count + ": " + text);
            // Counts each line, including newlines (skipped first line "5" because of .nextInt() from above)
            count++;
        }
        // Closes file
        fileScan.close();       

        // Creates Path object from filepath
        // Uses Path class to get absolute filepath for Scanner class
        // System.getProperty to get current working directory
        Path currentDirectory = Paths.get(System.getProperty("user.dir"));
        Path path = currentDirectory.resolve(filename);
        // Since Scanner is in Try-Catch, it does not need to have .close()
        try (Scanner scanner = new Scanner(path)) {
            while (scanner.hasNextLine()) {
                String text = scanner.nextLine();
                System.out.println(text);
            }
        }  catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}
