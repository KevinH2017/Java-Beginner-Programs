// Constructors must have the same name as their class
// They are run automatically even if they are not called, allowing you to create default variables and values
class Machine {
    private String name;
    private int code;

    public Machine() {
        this("Spanner", 2);                     // Calls the third constructor inside this constructor, must be the first line
        System.out.println("Constructor running!");
    }

    public Machine(String name) {
        this(name, 0);                              // Calls the third constructor inside this constructor, must be the first line
        this.name = name;
        System.out.println("Second constructor is running!");
    }

    public Machine(String name, int code) {
        this.name = name;
        this.code = code;
        System.out.println("Third constructor is running!");
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Does not need to assign it to a variable to create a constructor
        // You can just create the constructor object as seen below
        // new Machine();

        Machine machine1 = new Machine();

        Machine machine2 = new Machine("Robo");

        Machine machine3 = new Machine("Iron Giant", 20);
    }
}
