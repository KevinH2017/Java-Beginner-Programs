// Serialization is converting the state of an object into a byte stream.
// This allows us to save the state of an object to a file or database.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Creates objects for serialization
public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        Person person1 = new Person(123, "John");
        Person person2 = new Person(456, "Jane");

        System.out.println(person1);
        System.out.println(person2);

        // Outputs objects to people.bin file
        try (FileOutputStream fileOut = new FileOutputStream("people.bin")) {
            
            // Writes Person objects to people.bin file
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            
            objectOut.writeObject(person1);
            objectOut.writeObject(person2);

            // ObjectOutputStream must have .close() even in try-catch loop
            objectOut.close();

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
