// Forces Machine class to use the methods in Info
public class Machine implements Info, IStartable {
    private int id = 7;

    // public void start() {
    //     System.out.println("Machine Started!");
    // }

    // Uses ShowInfo() method from interface Info
    public void showInfo() {
        System.out.println("Machine ID: " + id);
    }
    public void start() {
        System.out.println("Machine Started!");
    }
    public void stop() {
        System.out.println("Machin Stopped!");
    }
}
