/* Checked Exceptions:
  ---------------------
 - Checked at compile time
 - Derived from Exception
 - Caused by external factors like file I/O and database connection cause the checked Exception
 - Checked exceptions must be handled using a try-catch block or must be declared using the throws keyword
 - Examples: IOException, SQLException, FileNotFoundException

   Runtime Exceptions:
  ---------------------
 - Checked at run time
 - Derived from RuntimeException
 - Caused by programming bugs like logical errors cause unchecked Exceptions
 - No handling is required
 - Examples: NullPointerException, ArrayIndexOutOfBoundsException
 */

public class RuntimeCheckedExceptions {
    public static void main(String[] args) {
        // Runtime exception is when an exception occurs during the execution of the program
        // It is also known as unchecked exceptions
        // It does not require a throw/catch
        // int num = 7;
        // num = num/0;        // You cannot divide by 0

        // Causes NullPointerException, a subclass of RuntimeCheckedExceptions
        // String text = null;
        // System.out.println(text.length());      // null has no length

        // Causes ArrayIndexOutOfBoundsException, a subclass of IndexOutOfBoundsException, which is a subclass of RuntimeCheckedExceptions
        // String[] texts = {"one", "two", "three"};
        // System.out.println(texts[3]);               // There is no texts[3], since there are only three entries

        String[] texts = {"one", "two", "three"};
        // Catches ArrayIndexOutOfBoundsException, a subclass of RuntimeCheckedExceptions
        try {
            System.out.println(texts[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

    }
}