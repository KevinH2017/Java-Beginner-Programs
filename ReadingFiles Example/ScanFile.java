import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.IOException;

public class ScanFile {
    public static void main(String[] args) {
        String fileName = "test.txt"; // Replace with your file name

        Path currentDir = Paths.get(System.getProperty("user.dir"));
        Path filePath = currentDir.resolve(fileName);

        try (Scanner scanner = new Scanner(filePath)) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }
}