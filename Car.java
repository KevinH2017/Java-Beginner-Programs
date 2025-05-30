// Child of Machine.java
// Inherits all the methods of Machine.java
public class Car extends Machine {
    // Runs this start() method when called by Car object instead of the one in Machine.java
    // public void start() {
    //     System.out.println("Car Started!");
    // }

    // Annotation that checks if the method is overriding a method in the parent class
    @Override
    public void start() {
        System.out.println("Car Started!");
    }
    
    public void WipeWindshield() {
        System.out.println("Wiping Windshield");
    }

    public void ShowInfo() {
        System.out.println("Car Name: " + name);
    }
}
