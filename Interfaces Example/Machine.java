// Forces Machine class to use the methods in Info
public class Machine implements Info {
    private int id = 7;

    public void start() {
        System.out.println("Machine Started!");
    }

    // Uses ShowInfo() method from interface Info
    public void ShowInfo() {
        System.out.println("Machine ID: " + id);
    }
}
