import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    @Override
    public int compareTo(Person person) {
        // return name.compareTo(person.name);     // Sorts in alphabetical order
        // return -name.compareTo(person.name);        // Sorts in reverse alphabetical order

        // Sorts by length of name
        int len1 = name.length();
        int len2 = person.name.length();

        if (len1 > len2) {
            return 1;
        } else if (len1 < len2) {
            return -1;
        } else {
            // Only returns 0 if the names are the exact same
            // This fixes TreeSets checker for same lengths (duplicate values)
            return name.compareTo(person.name);
        }
    }
}

public class NaturalOrdering {
    public static void main(String[] args) {
        // List maintains the order of elements in which they are added and allows duplicates
        List<Person> list = new ArrayList<>();

        // TreeSet does not allow duplicates and will throw NullPointerException with null elements
        // If sorting by length of elements, duplicate lengths are removed by default, must be fixed in compareTo() in Person class
        SortedSet<Person> set = new TreeSet<>();

        addElements(list);
        addElements(set);

        Collections.sort(list);

        System.out.println("List Elements:");
        showElements(list);
        System.out.println("\nSet Elements:");
        showElements(set);
    }

    private static void addElements(Collection<Person> col) {
        // Adds elements to the Collection
        col.add(new Person("Joe"));
        col.add(new Person("Juliet"));
        col.add(new Person("Claire"));
        col.add(new Person("Sue"));
        col.add(new Person("Mike"));
    }

    private static void showElements(Collection<Person> col) {
        // Prints out all elements in the Collection
        for (Person element: col) {
            System.out.println(element);
        }
    }
}
