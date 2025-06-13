// HashMap stores items in key-value pairs that can be accessed by an index
// of another type, ex: String.
// One object is used as a key (index) to another object (value), allowing you to
// store different data types together.
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Cat");
        map.put(2, "Dog");
        map.put(3, "Bird");
        map.put(4, "Fox");
        map.put(5, "Squirrel");

        // Gets the value of key 3 from the HashMap
        String text = map.get(3);
        System.out.println(text);

        // If key is not in the HashMap, null is returned
        String empty = map.get(8);      // Key does not exist
        System.out.println(empty);          // Prints null

        // Loops through all key-value pairs and prints them as a set
        for (Map.Entry<Integer, String> entry: map.entrySet()) {
            int key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ": " + value);
        }
    }
}
