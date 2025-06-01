// Multiple interfaces can be used in a class
public class Interfaces {
    public static void main(String[] args) {
        Machine machine1 = new Machine();
        // Start() Stop() methods come from IStartable interface
        machine1.start();
        machine1.stop();

        Person person1 = new Person("John");
        person1.greet();

        // Can only use Info interface in Machine class
        Info info1 = new Machine();
        info1.showInfo();

        // Uses Info interface on person1 variable
        Info info2 = person1;
        info2.showInfo();

        OutputInfo(machine1);
        OutputInfo(person1);
    }

    // Private method that uses Info interface
    private static void OutputInfo(Info info) {
        info.showInfo();
    }
}
