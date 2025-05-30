public class StringBuilderAndFormatting {
    public static void main(String[] args) {
        // Inefficient way to create strings
        // In Java this is not the same as appending strings, this is creating new strings each time which is memory inefficient
        String info = "";
        info += "My name is Bob";
        info += " and ";
        info += "I am a builder.";
        System.out.println(info);

        // More memory efficient way to append strings
        StringBuilder sb = new StringBuilder();
        sb.append("My name is Lupin.");
        sb.append(" ");
        sb.append("I am a master thief.");
        System.out.println(sb.toString());

        // Another way to use .append() multiple times, can also be on the same line
        StringBuilder s = new StringBuilder();
        s.append("My name is James.")
        .append(" ")
        .append("James Bond");
        System.out.println(s.toString());

        // In-line formatting, ex: tab and newline
        System.out.print("Here is some text.\tThat was a tab.\nThat was a newline.");
        System.out.println(" More text.");

        // In-line variable formatting, ex: %d to format numeric variables
        // %10d to pad 10 spaces before the variable, %-10d to pad 10 spaces after the variable
        System.out.printf("Total cost: %-10d; quantity is %d.\n", 10, 200);

        // %2d helps format lines of text to be lined up
        for (int i=0; i<20; i++) {
            System.out.printf("%-2d: %s\n", i, "Text Here");        // %s for string variables
        }

        // %f to format floating point numbers, by default it shows 6 digits after the decimal point
        System.out.printf("Total value: %.2f\n", 5.6123456);        // %.2f rounds to two decimal places
        System.out.printf("Total value: %10.3f\n", 5612.3456);      // %10.1f rounds to three decimal place with a total of ten characters, including the decimal point
    }
}
