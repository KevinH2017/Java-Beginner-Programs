public class Car extends Machine{

    @Override
    public void start() {
        System.out.println("Starting Car!");
    }

    @Override
    public void doStuff() {
        System.out.println("Car is running!");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down car.");
    }

}
