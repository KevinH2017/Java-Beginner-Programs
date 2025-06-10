// Java uses "Pass by Value" in its arguments.
// Passing by value is when you pass a variable as an argument to a method.
// A copy of the variable's value is created and passed to the method, the method
// then uses this copy, and not the original variable. This is to make sure that
// any changes made to the parameter inside the method do not affect the original
// variable outside of the method.
public class PassingByValue {
    public static void main(String[] args) {
        // Passing primitive types; ex: int, String
        // =======================
        PassingByValue app = new PassingByValue();

        int num = 7;
        System.out.println("1. Num is: " + num);

        app.show(num);
        
        System.out.println("4. Num is: " + num);

        // Passing non-primitive types; ex: classes, objects
        // ===========================
        System.out.println();   // newline

        Person person = new Person("Bob");
        System.out.println("1. Person is: " + person);

        app.show(person);

        System.out.println("4. Person is: " + person);

    }

    public void show(int num) {
        System.out.println("2. Num is: " + num);
        
        num = 8;

        // Variable num changes to 8,
        // and it does not affect the value of the same variable in main()
        System.out.println("3. Num is: " + num);
    }

    public void show(Person person) {
        System.out.println("2. Person is: " + person);

        // Changes the person variable value to "John"
        // and affects person variable outside this method
        person.setName("John");

        person = new Person("Jane");
        // person.setName("John");  // Will overwrite the above new Person()

        // Will print "Jane" here, 
        // but "John" will appear outside this method
        System.out.println("3. Person is: " + person);
    }
}
