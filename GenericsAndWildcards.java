import java.util.ArrayList;

class Machine {
    @Override
    public String toString() {
        return "I am a machine!";
    }

    public void start() {
        System.out.println("Machine started!");
    }
}
class Camera extends Machine {
    @Override
    public String toString() {
        return "I am a camera!";
    }

    public void snap() {
        System.out.println("Snap! Photo taken!");
    }
}

public class GenericsAndWildcards {
    // Prints list of objects, ? --> wildcard
    public static void showList(ArrayList<? extends Machine> list) {
        for (Machine x: list) {
            System.out.println(x);
            x.start();
        }
    }
    public static void showList2(ArrayList<? super Camera> list) {
        for (Object x: list) {
            System.out.println(x);
        }
    }
    public static void showList3(ArrayList<?> list) {
        for (Object x: list) {
            System.out.println(x);
        }
    }
    public static void main(String[] args) {
        ArrayList<Machine> list1 = new ArrayList<Machine>();
        list1.add(new Machine());
        list1.add(new Machine());
        showList(list1);

        ArrayList<Camera> list2 = new ArrayList<Camera>();
        list2.add(new Camera());
        list2.add(new Camera());
        showList(list2);

        showList2(list1);
        
        showList3(list1);
    }
}
