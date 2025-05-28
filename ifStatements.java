public class ifStatements {
    public static void main(String[] args) {
        int myInt = 5;
        if (myInt < 10) {
            System.out.println("The integer is less than 10!");
        } else if(myInt < 20)  {
            System.out.println("The integer is less than 20!");
        } else {
            System.out.println("None of the above");
        }

        int loop = 0;
        while (true) {
            System.out.println("Looping: " + loop);
            if (loop == 5) {
                break;      // Breaks out of while loop
            }
            loop++;
            System.out.println("Loop is running...");
        }
    }
}