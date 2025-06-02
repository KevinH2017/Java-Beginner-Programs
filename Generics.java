// Generics allow classes and methods to use multiple different data types at once.
// Without having to write multiple versions of the same code for different types.
import java.util.ArrayList;
import java.util.HashMap;

public class Generics {
    public static void main(String[] args) {
        // Way to create use Generics before Java 5 (OLD)
        ArrayList list = new ArrayList();
        list.add("apple");
        list.add("banana");
        list.add("orange");

        String fruit = (String)list.get(1);
        System.out.println(fruit);

        // Current way to make ArrayList objects:
        // Objects in the list will now be Strings
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("cat");
        strings.add("dog");
        strings.add("bird");

        String animal = strings.get(1);
        System.out.println(animal);

        // Multiple data types in arguments:
        // Hashmap that has an integer and strings
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // Java 7 style onward:
        // Java will infer what type the ArrayList Animal objects are
        ArrayList<Animal> list2 = new ArrayList<>();

    }
}
