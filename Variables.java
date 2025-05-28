public class Variables {
    public static void main(String[] args) {
        // Creates variables, assigns the values, and prints the variable to console
        int myNumber = 5;               // Whole numbers between -2147483648 to 2147483647
        short myShort = 12345;          // Whole numbers between -32768 to 32767
        long myLong = 1234567890L;      // Whole numbers between -9223372036854775808 to 9223372036854775808, end values with "L"
        double myDouble = 1234.56789d;  // Fractions between 1.7e−308 to 1.7e+308, end values with "d"
        float myFloat = 1234.56f;       // Fractions between 3.4e−038 to 3.4e+038, end values with "f"
        char myChar = 'A';              // A single character, must be in single quotes
        boolean myBoolean = false;      // Value 'true' or 'false'
        byte myByte = 127;              // Whole numbers between -128 to 127

        System.out.println("--- Data types with examples ---");
        System.out.println("Integer: " + myNumber);
        System.out.println("Short: " + myShort);
        System.out.println("Long: " + myLong);
        System.out.println("Double: " + myDouble);
        System.out.println("Float: " + myFloat);
        System.out.println("Character: " + myChar);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Byte: " + myByte);
    }
}