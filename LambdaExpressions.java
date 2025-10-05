// interface is used to group related methods with empty bodies
interface Executable {
    // Takes an integer parameter
    int execute(int a, int b);
}

interface StringExecutable {
    int execute(String a);
}

// Runner class implements interface Executable
class Runner {
    public void run(Executable e) {
        System.out.println("Executing code block...");
        // Default value
        int value = e.execute(12, 13);
        System.out.println("Return value is: " + value);
    }

    public void run(StringExecutable e) {
        System.out.println("Executing code block...");
        // Default value
        int value = e.execute("Hello, this is a StringExecutable");
        System.out.println("Return value is: " + value);
    }
}

/*
 * Lambda expressions are short blocks of code that takes in parameters and returns a value
 * They are similar to methods but do not need a name and can be written inside of a method body
 * 
 * Examples:
 * 
 * One line:
 * () -> System.out.println("Hello World!");
 * 
 * Multiple lines:
 * () -> {
            System.out.println("This is code passed in a lambda expression.");
            System.out.println("Using Lambda Expression: Hello World!");
        }

 * Returns a data type: 
 * () -> {
            return 8;
        }
    or
 * () -> 8
 * 
 * Lambda expression using integer a parameter:
 * (int a) -> {
            return 8 + a;
        }
    or
    (a) -> 4 + a
 */
public class LambdaExpressions {
    public static void main(String[] args) {
        int c = 100;
        
        Runner runner = new Runner();

        // Using Anonymous Class:
        runner.run(new Executable() {
            // Must specify data type for parameter variables, int
            @Override
            public int execute(int a, int b) {
                System.out.println("Using Anonymous Class: Hello World!");
                // a=12, b=13 (From Runner.run class)
                return 7 + a + b;
            }
        });

        System.out.println("==============================================");

        // Using Lambda Expression:
        runner.run((a, b) -> {
            System.out.println("This is code passed in a lambda expression.");
            System.out.println("Using Lambda Expression: Hello World!");
            // a=12, b=13 (From Runner.run class)
            return 8 + a + b;
        });

        System.out.println("==============================================");

        // Returns integer 10
        runner.run((a, b) -> 10);

        System.out.println("==============================================");

        // Java infers the data type of parameter a to be integer
        // a=12, b=13 (From Runner.run class)
        // Only a is used
        runner.run((a, b) -> 4 + a);

        System.out.println("==============================================");

        // Adds all variables
        runner.run((a, b) -> a + b + c);
    }
}
