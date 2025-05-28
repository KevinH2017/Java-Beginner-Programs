public class ArrayOfStrings {
    public static void main(String[] args) {
        String[] words = new String[3];

        words[0] = "Hello";
        words[1] = "to";
        words[2] = "you";

        System.out.println(words[2]);

        String[] fruits = {"apple", "banana", "pear", "kiwi"};
        // Iterates through fruits array and each string is printed through fruit variable
        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        // int value = 0;           // Integers hold a static value in memory

        String text = null;         // Holds a reference to the string variable that can change
        System.out.println(text);   // null is default and an empty value

        String[] texts = new String[2];
        System.out.println(texts[0]);       // null is default and an empty value

        texts[0] = "one";                   // null value is changed to "one", which has a value
        System.out.println(texts[0]);
    }
}
