// Transient is used when you don't want to save the value of a particular variable in a file.
// One example is for state of instance values like personal information, current date, or other private data.
import java.io.Serializable;

public class Person implements Serializable {
    // int id is not serialized and the default, 0, is saved to file instead
    private transient int id;
    private String name;
    // static variables are not serialized and the default, 0, is saved to file instead
    private static int count;

    public Person() {
        System.out.println("Default constructor");
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;

        System.out.println("Two-argument constructor");
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", count=" + count + "]";
    }
}
