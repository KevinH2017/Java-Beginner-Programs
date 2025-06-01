// Casting is when Java assigns a value of one data type to another type
// This can happen from smaller data types to higher data types or from 
// higher data types to smaller data types
public class Casting {
    public static void main(String[] args) {
        byte byteVal = 20;
        short shortval = 55;

        int intVal = 777;
        long longVal = 12345;

        float floatVal = 789.456f;              // Floating points must end with f
        float floatVal2 = 55.44f;
        double doubleVal = 67.89;

        System.out.println(Byte.MAX_VALUE);     // Max Byte value is 127

        intVal = (int)longVal;                  // Changes the long variable to become an integer
        System.out.println(intVal);

        doubleVal = intVal;
        System.out.println(doubleVal);          // long changes to double type; 12345.0

        intVal = (int)floatVal;
        System.out.println(intVal);             // float is changed to an integer

        // Below will not output 128, it is to big to be contained in a Byte variable
        // Bytes have a maximum value of 127; having 128 will output -128, because it causes an overflow
        byteVal = (byte)128;
        System.out.println(byteVal);            
    }
}
