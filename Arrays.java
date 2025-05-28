public class Arrays {
    public static void main(String[] args) {
        // Holds only 1 value at a time
        // int value = 7;

        // Creates an array that can hold 3 values
        int[] values = new int[3];

        System.out.println(values[0]);  // Currently no value is held (defaults to 0)

        // Assigns values to each int in the array
        values[0] = 10;
        values[1] = 20;
        values[2] = 30;

        // System.out.println(values[0]);
        // System.out.println(values[1]);
        // System.out.println(values[2]);

        // Loops through length of values array, printing each int
        for (int i = 0; i<values.length; i++) {
            System.out.println(values[i]);
        }

        // Initializes an array with integers on one line
        int[] numbers = {5, 6, 7};
        for (int i = 0; i<numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}