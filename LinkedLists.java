// LinkedList is similar to ArrayList, both are collections which can contain many 
// objects of the same type. LinkedList has all the same methods as ArrayList.
// LinekdList however stores items in "containers", each container has a link to 
// the next container in the list, to add an element to the list, the element is 
// placed into a new container and the container is linked to one of the other 
// containers in the list.

// Use ArrayList for storing and accessing data, and LinkedList to manipulate data.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedLists {
    public static void main(String[] args) {
        /*
         * ArrayLists manage arrays internally, ex:
         * [0][1][2][3][4]...
         */
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

        /*
         * LinkedList have items in containers that are linked from one to the next, ex:
         * [0]-->[1]-->[2]-->[3]-->[4]-->...
         */
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);
    }

    // Can take any list type variable that holds Integers as an argument
    private static void doTimings(String type, List<Integer> list) {
        // 1E5 = 1*10^5, creating a 100,000 item list
        for (int i=0; i<1E5; i++) {
            list.add(i);
        }

        // Start timer in milliseconds
        long start = System.currentTimeMillis();

        /*
        // Add 100,000 more items to the list
        for (int i=0; i<1E5; i++) {
            list.add(i);
        }
        */
        
        /* 
        // Continously add items to the first index of the list
        // ArrayList will take much longer than LinkedList here
        for (int i=0; i<1E5; i++) {
            list.add(0, i);
        }
        */

        // Adds items 100 indexes from the end of the list
        // ArrayList will be faster than LinkedList here
        for (int i=0; i<1E5; i++) {
            list.add(list.size() - 100, i);
        }

        // End timer in milliseconds
        long end = System.currentTimeMillis();

        // Prints out how long it took for the list to finish
        System.out.println("Time taken: " + (end - start) + " ms for " + type);
    }
}
