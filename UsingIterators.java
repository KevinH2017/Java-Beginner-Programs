import java.util.Iterator;
import java.util.LinkedList;

public class UsingIterators {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<>();

        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");
        animals.add("Fox");
        animals.add("Mouse");

        // String Iterator object for animals LinkedList
        Iterator<String> it = animals.iterator();

        System.out.println("Iterator while-loop:");
        // While there is an object next in the list, the loop continues
        while (it.hasNext()) {
            String item = it.next();
            System.out.println(item);

            // Checks if the item is "Cat" and then removes it from the LinkedList
            if (item.equals("Cat")) {
                it.remove();
            }
        }
        System.out.println("\nRemoved 'Cat' from list");
        System.out.println("\nfor-each loop:");
        // for-each loop for animals LinkedList
        for (String animal : animals) {
            System.out.println(animal);
        }
    }
}
