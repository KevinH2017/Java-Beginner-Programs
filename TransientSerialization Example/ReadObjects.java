import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

// Reads objects for deserialization
public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        // Reads objects in people.ser
        try (ObjectInputStream objectIn = new ObjectInputStream(
            new FileInputStream("people.ser"));) {

            Person person = (Person)objectIn.readObject();
            System.out.println(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
