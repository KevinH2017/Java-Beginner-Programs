class Machine {
    public void start() {
        System.out.println("Machine started!");
    }
}

interface Plant {
    public void grow();
}

public class AnonymousClasses {
    public static void main(String[] args) {
        // Anonymous class created below, it overrides the above Machine class
        Machine machine1 = new Machine() {
            // Overrides the above start() method
            @Override
            public void start() {
                System.out.println("Snap! Photo taken!");
            }
        };

        machine1.start();

        // Anonymous class created below, it overrides the above Plant interface
        Plant plant1 = new Plant() {
            @Override
            public void grow() {
                System.out.println("Plant growing!");
            }
        };

        plant1.grow();
    }
}
