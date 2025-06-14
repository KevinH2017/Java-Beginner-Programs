import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsExample {
    public static void main(String[] args) {
        // HashSet does not maintain order of items
        Set<String> hashSet = new HashSet<>();

        // LinkedHashSet does maintain the order of items
        Set<String> LinkedSet = new LinkedHashSet<>();

        // TreeSet sorts items by value and does not allow null values
        Set<String> treeSet = new TreeSet<>();

        
        System.out.println("HashSet:");
        testSet(hashSet);

        System.out.println("\nLinkedHashSet:");
        testSet(LinkedSet);

        System.out.println("\nTreeSet:");
        testSet(treeSet);

        // Intersection, checks if any elements are in both sets
        Set<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Dog");
        treeSet2.add("Cat");
        treeSet2.add("Monkey");
        treeSet2.add("Giraffe");
        treeSet2.add("Ant");
        
        Set<String> intersectSet = new HashSet<>(treeSet);      // Copy set of treeSet
        // System.out.println(intersectSet);

        System.out.println("\nIntersection:");
        intersectSet.retainAll(treeSet2);                       // Retains all elements that are in both sets
        System.out.println(intersectSet);                       // Prints ["Cat", "Dog"]

        // Difference, finds all elements that are only in one of the sets
        Set<String> diffSet = new HashSet<>(treeSet);           // Copy of treeSet
        System.out.println("\nDifference:");
        diffSet.removeAll(treeSet2);                            // Finds all elements that are diffSet, but not in treeSet2
        System.out.println(diffSet);                            // Prints ["Mouse", "Snake", "Bird"]
    }   
    
    public static void testSet(Set<String> set) {
        // Checks if set is empty
        if (set.isEmpty()) {
            System.out.println("Set is empty at start");
        }

        set.add("Dog");
        set.add("Cat");
        set.add("Bird");
        set.add("Mouse");
        set.add("Snake");

        // Duplicate items are not added to set, no error occurs
        set.add("Dog");

        System.out.println(set);

        // Goes through set and prints each value in the set
        Iterator iter = set.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        // Checks if set contains the item
        if (set.contains("Crow")) {
            System.out.println("Set contains 'Crow'");
        } else if (set.contains("Cat")) {
            System.out.println("Set contains 'Cat'");
        }
    }
}
