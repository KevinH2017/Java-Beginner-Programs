class Person {
    /*  
        Classes can contain:
        1. Data
        2. Subroutines (methods)
    */

    // Instance variables (data or "state")
    String name;
    int age;

    // Instance Subroutine / Method
    void speak() {
        for (int i=0; i<3; i++) {
            System.out.println("My name is: " + name + " and I am " + age + " years old.");
        }
    }

    void sayHello() {
        System.out.println("Hello there!");
    }
}

public class Methods {
    public static void main(String[] args) {
        // Person object is created and assigned a string name and integer age
        Person person1 = new Person();
        person1.name = "John Smith";
        person1.age = 37;
        // Calls speak() method and uses object values to print to console
        person1.speak();
        // Calls sayHello() method
        person1.sayHello();

        Person person2 = new Person();
        person2.name = "Jane Doe";
        person2.age = 29;
        person2.speak();
        person2.sayHello();

        // Call Person object and their corresponding values
        // System.out.println(person1.name);       
        // System.out.println(person1.age);
        // System.out.println(person2.name);
        // System.out.println(person2.age);
    }
}
