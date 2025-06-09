// Deserialization is the reverse, from byte stream to an object.
// This is often used to transfer objects across a netowrk, enabling communication
// between different computers or systems.
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// Reads objects for serialization
public class ReadObjects {
    public static void main(String[] args) {
        System.out.println("Reading objects...");

        // Multiple auto-close statements can be put into try statement
        // Takes people.ser file as input and reads Person array from people.ser
        try (FileInputStream fileIn = new FileInputStream("people.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);) {

            Person[] people = (Person[])objectIn.readObject();

            // Stops warning Type safety: Unchecked cast from Object to ArrayList<Person>
            @SuppressWarnings("unchecked")      
            // Make sure ArrayList object was created and written to file before running
            ArrayList<Person> peopleList = (ArrayList<Person>)objectIn.readObject();

            // Prints each object in Person array and ArrayList
            for (Person person: people) {
                System.out.println(person);
            }
            for (Person person: peopleList) {
                System.out.println("ArrayList: " + person);
            }

            // Reads objects until the end of the Array
            int num = objectIn.readInt();
            for (int i=0; i<num; i++) {
                Person person = (Person)objectIn.readObject();
                System.out.println(person);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
