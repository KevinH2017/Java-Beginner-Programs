// Imports java libraries
import java.util.ArrayList;
import java.util.List;

/*
 * The Main class demonstrates basic Java syntax and features, including:
 *   - Printing messages to the console using System.out.println and System.err.println
 *   - Creating and manipulating ArrayList and List collections
 *   - Declaring variables of different data types, including a reference to a custom Temp class
 * The Main method serves as the entry point for the application
 */
public class Main {
    public static void main(String[] args) {
        // Prints text to console
        System.out.println("Hello");

        // Prints an error message to console
        System.err.println("An error");

        // Variables and their data types
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("One");
        arrayList.add("Two");
        arrayList.add("Three");
        System.out.println(arrayList);

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(20);
        list.add(100);
        System.out.println(list);

        // Data type from Temp.java class
        Temp temp;

    }

    public static void func() {
        
    }
}