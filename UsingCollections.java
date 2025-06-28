// A collection of objects that are represented as a single unit is known as a Java Collection of Objects.
// A separate framework called "Collection Framework", as of JDK 1.2, holds all the Java Collection Classes and Interfaces in it.
// In Java, the Collection interface (java.util.Collection) and Map interface (java.util.Map) are the two main "root" interfaces
// of Java collection classes.

import java.util.ArrayList;
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
         List<String> list1 = new ArrayList<>();

         // LinkedList if you need to remove or add items anywhere else in a list
         List<String> list2 = new LinkedList<>();

         
         /* SETS:
          * Only stores unique values
          * Great for removing duplicates
          * Does not use indexes, unlike a list
          * Very fast to check if a specific object exists
          * You can use your own objects using hashCode() and equals()
          */

          // HashSet if order is not important and is ok it if changes, HashSet is not ordered
          Set<String> set1 = new HashSet<>();

          // TreeSet sorts in natural order, must implement Comparable for custom types
          // EX: (1,2,3,4..., a,b,c...)
          Set<String> set2 = new TreeSet<>();

          // LinkedHashSet for elements to remain in order of when they were added
          Set<String> set3 = new LinkedHashSet<>();


        /* MAPS:
         * Uses Key-Value pairs
         * Similar to a lookup table
         * Retrieving a value through its key is fast
         * Iterating over map values is very slow
         * Maps are not optimised for iteration
         * To use your own objects as keys, you must implement hashCode() and equals(), like sets
         */

        // HashMap, keys are not in a specific order and are capable of changing
        Map<String, String> map1 = new HashMap<>();

        // TreeMap, keys are sorted in natural order, must implement Comparable for custom types
        Map<String, String> map2 = new TreeMap<>();

        // LinkedHashMaps, keys remain in order of when they were added
        Map<String, String> map3 = new LinkedHashMap<>();


        /* SORTED SETS:
         * Elements are stored in ascending order by default, custom order must use a Comparator
         * Does not allow duplicates, like sets
         * Null elements are not allowed
         * Sub-interface of Set
         */

         SortedSet<String> ss = new TreeSet<>();


        /* SORTED MAPS:
         * Ensures keys are stored in a sorted order, custom order must use a Comparator
         * Orders keys by their natural order or by a specified Comparator
         * EX: (1,2,3,4..., a,b,c...)
         * Does not allow null keys or null values, if null is inserted, it will throw an error
         * Sub-interface of Map
         */

        SortedMap<String, Integer> sm = new TreeSet();
    }
}
