public abstract class Machine {
    private int id;

    // Getter
    public int getId() {
        return id;
    }

    // Setter
    public void setId(int id) {
        this.id = id;
    }

    // Abstract methods can only be used in an abstract class,
    // and it does not have a body, the body is provided by
    // the subclasses that inherit it.
    // Subclasses must have these abstract methods.
    public abstract void start();

    public abstract void doStuff();

    public abstract void shutdown();

    // Calling abstract methods within the abstract class itself
    public void run() {
        start();
        doStuff();
        shutdown();
    }
}
