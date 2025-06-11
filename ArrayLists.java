// ArrayList is a child class of List
import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {
        // Creates ArrayList object that holds integers
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        // Adds integers to the ArrayList
        numbers.add(123);
        numbers.add(456);
        numbers.add(7890);
        
        // Gets integer from the specific index
        System.out.println(numbers.get(1));

        System.out.println("\nTraditional For-Loop Iteration: (Uses index)");
        // for-loop through the size of the list, get the index, and print each integer
        for (int i=0; i<numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("\nList For-Loop Iteration: (Does not need index)");
        // for-loop through entire ArrayList and print each integer, does not need index
        for (Integer num: numbers) {
            System.out.println(num);
        }

        System.out.println("\nRemoving Items From List:");
        System.out.println("\nRemoving last item...");
        // Removing items, removes the last item in list (FAST)
        numbers.remove(numbers.size() - 1);
        System.out.println("Removing first item...");
        // Removes the first item in list, copies the rest of the items to fill the empty spot and moves index value (SLOW)
        numbers.remove(0);

        // Prints list of remaining integers (as a list)
        System.out.println(numbers);

        // ArrayList of strings 
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        // Prints list of strings (as a list)
        System.out.println(words);
    }
}
