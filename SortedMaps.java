import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMaps {
    public static void main(String[] args) {
        // HashMap stores key-value pairs
        Map<Integer, String> map = new HashMap<>();

        // LinekdHashMaps stores key-value pairs while also maintaing the order of the order of each pair
        // and allows one null key and multiple null values
        Map<Integer, String> linkedMap = new LinkedHashMap<>();

        // TreeMap store key-value pairs that are always sorted and does not allow null as a key
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("HashMap:");
        testMap(map);

        System.out.println("\nLinkedHashMap:");
        testMap(linkedMap);      // Does not maintain order of keys

        System.out.println("\nTreeMap:");
        testMap(treeMap);        // Maintains order of keys
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(5, "Fish");
        map.put(4, "Cat");
        map.put(2, "Dog");
        map.put(0, "Bird");
        map.put(6, "Fox");
        map.put(3, "Squirrel");
        map.put(1, "Mouse");

        // Iterates through map to get key-values
        for (Integer key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + ": " + value);
        }
    }
}
