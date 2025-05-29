class Person {
    /*  
        Classes can contain:
        1. Data
        2. Subroutines (methods)
    */

    // Instance variables (data or "state")
    String name;
    int age;
}

public class ClassAndObjects {
    public static void main(String[] args) {
        // Person object is created and assigned a string name and integer age
        Person person1 = new Person();
        person1.name = "John Smith";
        person1.age = 37;

        Person person2 = new Person();
        person2.name = "Jane Doe";
        person2.age = 29;

        // Call Person objects and their values
        System.out.println(person1.name);       
        System.out.println(person1.age);
        System.out.println(person2.name);
        System.out.println(person2.age);
    }
}
