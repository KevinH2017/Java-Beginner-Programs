package handle1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

// Exceptions must be handled
public class HandlingExceptions {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader reader = new FileReader(file);
    }
}