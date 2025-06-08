public class Robot {
    private int id;

    // Nested class that helps group classes that belong together making code more readable and maintainable
    // Inner classes can be accessed by creating an object in the outer class, and then create an object of the inner class
    private class Brain {
        public void think() {
            System.out.println("Robot " + id + " is thinking therefore it is.");
        }
    }

    public static class Battery {
        public void charge() {
            System.out.println("Battery is charging!");
        }
    }

    public Robot(int id) {
        this.id = id;
    }

    public void start() {
        System.out.println("Starting robot " + id);

        Brain brain = new Brain();
        brain.think();

        final String name = "Bob";

        class Temp {
            public void doSomething() {
                System.out.println("ID is: " + id);
                System.out.println("My name is " + name);
            }
        }

        Temp temp = new Temp();
        temp.doSomething();
    }
}
