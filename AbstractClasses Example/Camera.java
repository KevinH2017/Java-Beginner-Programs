public class Camera extends Machine {

    @Override
    public void start() {
        System.out.println("Starting Camera!");
    }

    @Override
    public void doStuff() {
        System.out.println("Operating camera!");
    }

    @Override
    public void shutdown() {
        System.out.println("Shutting down camera.");
    }

}
