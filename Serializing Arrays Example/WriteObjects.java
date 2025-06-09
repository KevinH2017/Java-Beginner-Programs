// Serialization is converting the state of an object into a byte stream.
// This allows us to save the state of an object to a file or database.
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

// Creates objects for serialization
public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing objects...");

        // Array of Person objects
        Person[] people = {new Person(1, "John"),
                            new Person(2, "Jane"), 
                            new Person(3, "Bob")};

        // ArrayList is a resizable array
        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

        // Multiple auto-close statements can be put into try statement
        // Outputs objects to people.ser file and writes Person array to people.ser file
        try (FileOutputStream fileOut = new FileOutputStream("people.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);) {

            objectOut.writeObject(people);
            objectOut.writeObject(peopleList);
            objectOut.writeInt(peopleList.size());

            for (Person person: peopleList) {
                objectOut.writeObject(person);
            }

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
