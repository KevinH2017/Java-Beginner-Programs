// Generics allow classes and methods to use multiple different data types at once.
class GenericsExample {
    // Generic method:
    static <Type> void genericDisplay(Type variable) {
        // Prints out class name, data type, and variable
        System.out.println(variable.getClass().getName() + " = " + variable);
    }

    public static void main(String[] args) {
        
        // Integer argument
        genericDisplay(11);

        // String argument
        genericDisplay("This is a string");

        // Double argument
        genericDisplay(1.0);
    }
}