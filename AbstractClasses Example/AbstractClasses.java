// Abstract classes are restricted classes that cannot be used to create objects,
// to access them they must be inherited by another class.
// Abstraction is the process of hiding certain details and showing only essential
// information to the user.
public class AbstractClasses {
    public static void main(String[] args) {
        Camera cam1 = new Camera();
        cam1.setId(5);
        System.out.println("Camera ID: " + cam1.getId());
        // cam1.start();
        // cam1.doStuff();
        // cam1.shutdown();

        cam1.run();         // Calls start(), doStuff(), and shutdown()

        Car car1 = new Car();
        car1.setId(4);
        System.out.println("Car ID: " + car1.getId());
        // car1.start();
        // car1.doStuff();
        // car1.shutdown();

        car1.run();         // Calls start(), doStuff(), and shutdown()


        // Error occurs, because Machine class is abstract 
        // Machine machine1 = new Machine();        // Machine is an abstract class
    }
}
