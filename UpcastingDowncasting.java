class Machine {
    public void start() {
        System.out.println("Machine started!");
    }
}
class Camera extends Machine {
    public void start() {
        System.out.println("Camera started!");
    }
    public void snap() {
        System.out.println("Snap! Photo taken!");
    }
}

public class UpcastingDowncasting {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        Camera camera1 = new Camera();

        machine1.start();
        camera1.start();
        camera1.snap();

        // Upcasting - Typcasting of a child object up to a parent object. Can be implicit
        // machine2 gets Camera class start() instead of Machine class
        Machine machine2 = camera1;
        machine2.start();               // Outputs "Camera started!"
        // machine2.snap();                // Error occurs because machine2 is still a Machine object, not Camera object, and cannot use Camera methods

        // Downcasting - Typcasing of a parent object down to a child object. Cannot be implicit
        Machine machine3 = new Camera();
        Camera camera2 = (Camera)machine3;      // Implicit typecasting, changes machine3 to Camera object
        camera2.start();
        camera2.snap();

        // Machine object cannot be cast to Camera object
        // Error, runtime error
        // Machine machine4 = new Machine();
        // Camera camera3 = (Camera)machine4;
        // camera3.start();                 
        // camera3.snap();
    }
}
