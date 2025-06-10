import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

// Creates objects for serialization
public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        // Writes objects to people.ser
        try (ObjectOutputStream objectOut = new ObjectOutputStream(
            new FileOutputStream("people.ser"));) {

            Person person = new Person(1, "Bob");
            Person.setCount(99);
            objectOut.writeObject(person);

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
