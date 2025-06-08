// Recursion is making a function call itself, helping to break down 
// complicated problems into smaller problems making them easier to solve
public class Recursion {
    public static void main(String[] args) {
        // Good for factorials, Ex: 4! = 4*3*2*1
        System.out.println(factorial(5));
    }

    private static int factorial(int num) {
        System.out.println(num);
        // There must be an ending to the recursion to prevent StackOverflow error
        if (num == 1) {
            // Exits factorial recursion
            return 1;
        }
        // Runs factorial() again
        return factorial(num - 1) * num;
    }
}
