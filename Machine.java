// Is used in Inheritance.java
public class Machine {
    // protected means it can be accessed within the same package and subclasses of this class the variable is in
    protected String name = "Panda Trueno";

    public void start() {
        System.out.println("Machine Started!");
    }
    
    public void stop() {
        System.out.println("Machine Stopped!");
    }
}