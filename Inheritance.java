// Automatically inherits methods and objects from Machine.java and Car.java in the same folder
public class Inheritance {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        machine1.start();
        machine1.stop();

        Car car1 = new Car();
        car1.start();
        car1.WipeWindshield();
        car1.ShowInfo();
        car1.stop();
    }
}
