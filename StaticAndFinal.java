class Thing {
    // final -> special constant in java that cannot have its value changed
    public final static int LUCKY_NUMBER = 7;
    public String name;
    // static variables are shared among all objects with this class
    public static String description;

    public int id;

    public static int count = 0;

    // Increases count everytime Thing class is run
    public Thing() {
        id = count;
        count++;
    }

    public void ShowName() {
        System.out.println("Object ID: " + id + ", " + description + ": " + name);
    }
    public static void ShowInfo() {
        System.out.println(description);
        
    }
}

public class StaticAndFinal {
    public static void main(String[] args) {
        // static variables can only be accessed and assigned from class object
        Thing.description = "I am a thing";
        // System.out.println(Thing.description);

        Thing.ShowInfo();

        System.out.println("Before creating objects: " + Thing.count);

        Thing thing1 = new Thing();
        Thing thing2 = new Thing();

        System.out.println("After creating objects: " + Thing.count);

        thing1.name = "John";
        thing2.name = "Jane";

        // System.out.println(thing1.name);
        // System.out.println(thing2.name);

        thing1.ShowName();
        thing2.ShowName();

        // Math class using PI method, and cannot be changed
        System.out.println(Math.PI);

        // Constant value that cannot be changed in Thing class
        System.out.println("Lucky Number: " + Thing.LUCKY_NUMBER);
    }
}
