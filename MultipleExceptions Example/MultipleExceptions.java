import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptions {
    public static void main(String[] args) {
        Test test = new Test();

        // Nested Try-Catch loop
        try {
            test.run();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            System.out.println("Couldn't parse command file.");
        }
        
        // Try-Multi-catch, catches multiple exceptions at once
        try {
            test.run();
        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }

        // Will catch any exception
        try {
            test.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        // You have to nest exceptions if one is a subclass
        // of the other
        try {
            test.input();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Below raises an error since the 
        // exception FileNotFoundException is 
        // already caught by the alternative 
        // IOException
        // try {
        //     test.input();
        // FileNotFoundException is a subclass of IOException
        // } catch (FileNotFoundException | IOException e) {
        //     e.printStackTrace();
        // }

    }
}
