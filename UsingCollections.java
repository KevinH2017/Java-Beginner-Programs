// A collection of objects that are represented as a single unit is known as a Java Collection of Objects.
// A separate framework called "Collection Framework", as of JDK 1.2, holds all the Java Collection Classes and Interfaces in it.
// In Java, the Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main "root" interfaces
// of Java collection classes.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* Things to consider: 
* 1. What do you need the collection to do?
* 2. Are you using the most efficient collection for your purpose?
* 3. How fast is it at insertion, deletion, retrieval, and moving elements in the data structure?
*/

public class UsingCollections {
    public static void main(String[] args) {

        /* LISTS:
         * Lists stores objects
         * Allows duplicates
         * The objects stay in order of insertion
         * Elements are indexed with integers
         * Lists are slow for checking for a particular item
         * Looking up an item by its index is fast
         * Iterating through a list is fast
         * Lists can be sorted before accessing it
         */

        // ArrayList if you only need to add or remove items at the end of a list
        List<String> list1 = new ArrayList<String>();
        list1.add("Cat");
        list1.add("Dog");
        list1.add("Bird");
        System.out.println("===ArrayList===");
        System.out.println(list1);
        list1.add(0, "Mouse");      // Add at beginning of Array
        System.out.println("Added at beginning of ArrayList:\n" + list1.get(0));
        System.out.println(list1);


        // LinkedList if you need to remove or add items anywhere else in a list
        List<String> list2 = new LinkedList<String>();
        list2.add("One");
        list2.add("Two");
        list2.add("Three");
        System.out.println("\n===LinkedList===");
        System.out.println(list2);

        list2.remove(1);                // Remove element from index 1
        System.out.println("Removed element at index 1 from LinkedList.");
        System.out.println("New LinkedList:\n" + list2);
        

        /* SETS:
        * Only stores unique values
        * Great for removing duplicates
        * Does not use indexes, unlike a list
        * Very fast to check if a specific object exists
        * You can use your own objects using hashCode() and equals()
        */

        // HashSet if order is not important and is ok it if changes, HashSet is not ordered
        Set<String> set1 = new HashSet<String>();
        set1.add("Pear");
        set1.add("Apple");
        set1.add("Orange");
        System.out.println("\n===HashSet===");
        System.out.println(set1);
        
        System.out.println("Does Apple exist?: " + set1.contains("Apple"));         // true
        System.out.println("Does Peanuts exist?: " + set1.contains("Peanuts"));     // false
        

        // TreeSet sorts in natural order, must implement Comparable for custom types
        // EX: (1,2,3,4..., a,b,c...)
        Set<Integer> set2 = new TreeSet<Integer>();
        set2.add(1000);
        set2.add(250);
        set2.add(500);
        System.out.println("\n===TreeSet===");
        System.out.println("Sorted by alphabetical / numerical order:");
        System.out.println(set2);               // TreeSet sorts by alphabetical/numerical order by default


        // LinkedHashSet for elements to remain in order of when they were added
        Set<String> set3 = new LinkedHashSet<String>();
        set3.add("Three");
        set3.add("Two");
        set3.add("One");
        System.out.println("\n===LinkedHashSet===");
        System.out.println("Insertion order is preserved:");
        System.out.println(set3);

        /* MAPS:
         * Uses Key-Value pairs
         * Similar to a lookup table
         * Retrieving a value through its key is fast
         * Iterating over map values is very slow
         * Maps are not optimised for iteration
         * To use your own objects as keys, you must implement hashCode() and equals(), like sets
         */

        // HashMap, keys are not in a specific order and are capable of changing
        Map<String, String> map1 = new HashMap<String, String>();
        // Key, Value (State, capital)
        map1.put("Massachusetts", "Boston");
        map1.put("Arkansas", "Little Rock");
        map1.put("Ohio", "Columbus");
        map1.put("Ohio", "Columbus");      // Duplicate, does not add because keys in HashMap must be unique
        System.out.println("\n===HashMap===");
        System.out.println(map1);

        // In HashMap, if the same key is added more than once, the latest value will overwrite the previous one
        map1.put("Massachusetts", "Boston Two");
        System.out.println("Massachusetts Value Changed:");
        System.out.println(map1);


        // TreeMap, keys are sorted in natural order, must implement Comparable for custom types
        Map<Integer, String> map2 = new TreeMap<Integer, String>();
        map2.put(3, "Dave");
        map2.put(1, "Jane");
        map2.put(2, "Bob");
        System.out.println("\n===TreeMap===");
        System.out.println("Sorted by numerical order:");// Sorted by keys numerically
        System.out.println(map2);

        // LinkedHashMaps, keys remain in order of when they were added
        Map<Integer, String> map3 = new LinkedHashMap<Integer, String>();
        map3.put(3, "Dave");
        map3.put(1, "Jane");
        map3.put(2, "Bob");
        System.out.println("\n===LinkedHashMap===");
        System.out.println("Stores keys and values in the order of insertion:");
        System.out.println(map3);

        /* SORTED SETS:
         * Elements are stored in ascending order by default, custom order must use a Comparator
         * Does not allow duplicates, like sets
         * Null elements are not allowed
         * Sub-interface of Set
         */

        SortedSet<String> ss = new TreeSet<String>();
        ss.add("Australia");
        ss.add("Germany");
        ss.add("Canada");
        ss.add("United States");
        ss.add("Mexico");
        ss.add("United States");                    // Duplicates are not allowed
        System.out.println("\n===SortedSet===");
        System.out.println(ss);
        ss.remove("Australia");
        System.out.println("SortedSet after removing Australia: " + ss);

        /* SORTED MAPS:
         * Ensures keys are stored in a sorted order, custom order must use a Comparator
         * Orders keys by their natural order or by a specified Comparator
         * EX: (1,2,3,4..., a,b,c...)
         * Does not allow null keys or null values, if null is inserted, it will throw an error
         * Sub-interface of Map
         */

        SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
        sm.put(4, "Jane");
        sm.put(3, "John");
        sm.put(2, "Dave");
        sm.put(0, "Bob");
        sm.put(1, "Paul");
        System.out.println("\n===SortedMap===");
        System.out.println(sm);                     // Automatically sorted by key
        
        System.out.println("\n===SortedMap Using Comparator===");
        // TreeMap with key String, value String
        SortedMap<String, String> tm = new TreeMap<String, String>(
            // Comparator that will compare two strings
            new Comparator<String>() {
                // compare() is an int variable because it returns a negative, zero, or positive integer 
                // if the first argument is less than, equal to, or greater than the second
                public int compare(String a, String b) {
                    return b.compareTo(a);
                }
            }
        );

        // Elements for TreeMap
        tm.put("1", "United States");
        tm.put("2", "Canada");
        tm.put("3", "Mexico");
        tm.put("4", "Australia");
        tm.put("5", "Germany");
        System.out.println(tm);

        // Removes element from TreeMap with key
        tm.remove("3");
        System.out.println("SortedMap after removing Mexico: " + tm);

    }
}
