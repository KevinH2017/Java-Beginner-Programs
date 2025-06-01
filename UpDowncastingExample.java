// Upcasting and Downcasting example

// Parent class
class Parent {
    String name;

    // Prints the string of the parent class
    void start() {
        System.out.println("Parent method");
    }
}

// Child class
class Child extends Parent {
    int id;

    // Prints the signature of the child class
    void start() {
        System.out.println("Child method");
    }
}

public class UpDowncastingExample {
    public static void main(String[] args) {
        // Upcasting
        Parent p = new Child();
        p.name = "Upcasting and Downcasting Example";

        // Printing the parent class name
        System.out.println(p.name);
        p.start();

        // Trying to Downcasting Implicitly
        // Child c = new Parent(); // Error, compile time error; Type mismatch: cannot convert from Parent to Child

        // Downcasting Explicitly
        Child c = (Child)p;

        c.id = 1;
        System.out.println(c.name);
        System.out.println(c.id);
        c.start();
    }
}