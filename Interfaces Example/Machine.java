// Forces Machine class to use the methods in Info
public class Machine implements Info, IStartable {
    private int id = 7;

    // public void start() {
    //     System.out.println("Machine Started!");
    // }

    // Uses ShowInfo() method from interface Info
    public void ShowInfo() {
        System.out.println("Machine ID: " + id);
    }
    public void Start() {
        System.out.println("Machine Started!");
    }
    public void Stop() {
        System.out.println("Machin Stopped!");
    }
}
