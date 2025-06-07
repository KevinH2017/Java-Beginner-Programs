// AutoCloseable requires close() method
class Temp implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("Closing!");
        // Throws a unique Exception message to try-catch block
        throw new Exception("An error occurred!");
    }
}

public class TryWithResources {
    public static void main(String[] args) {

        // Variable outside try-catch block
        // Temp temp = new Temp();
        // try {
        //     temp.close();
        // } catch (Exception e) {
        //     e.getStackTrace();
        // }

        // Try-With-Resources, automatically calls the close() method within the try statement
        // temp variable is inside try-catch block
        try (Temp temp = new Temp()) {
            System.out.println("Before the close() method");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
