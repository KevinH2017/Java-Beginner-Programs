class Robot {
    // Takes parameters from main to be used in the method
    public void speak(String text) {
        System.out.println(text);
    }
    public void jump(int height) {
        System.out.println("Jumping: " + height + " feet.");
    }
    public void move(String direction, double distance) {
        System.out.println("Moving in direction " + direction + " for " + distance + " feet.");
    }
}

public class MethodParameters {
    public static void main(String[] args) {
        Robot sam = new Robot();
        // Parameters to create method outputs
        sam.speak("Hello, my name is Sam.");
        sam.jump(7);
        sam.move("North", 25.5);

        // Variables can be used as parameters
        String greeting = "Hello!";
        sam.speak(greeting);

        int value = 5;
        sam.jump(value);
    }
}
