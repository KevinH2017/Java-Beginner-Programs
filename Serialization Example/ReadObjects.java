// Deserialization is the reverse, from byte stream to an object.
// This is often used to transfer objects across a netowrk, enabling communication
// between different computers or systems.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

// Reads objects for deserialization
public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        // Takes people.bin file as input
        try (FileInputStream fileIn = new FileInputStream("people.bin")) {
            
            // Reads Person objects from people.bin
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            Person person1 = (Person)objectIn.readObject();
            Person person2 = (Person)objectIn.readObject();

            // ObjectInputStream must have .close() even in try-catch loop
            objectIn.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
