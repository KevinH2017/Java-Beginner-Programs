class Person {
    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name );
    }
    // Method calculates and returns int yearsLeft variable
    int calculateYearsToRetirement() {
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    // Method returns int age variable
    int getAge() {
        return age;
    }

    // Method returns String name variable
    String getName() {
        return name;
    }
}

public class GettersAndReturn {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 43;

        // person1.speak();
        
        int years = person1.calculateYearsToRetirement();
        System.out.println(years + " years until retirement.");

        // Gets age and name from class Person methods GetAge() and GetName()
        int age = person1.getAge();
        String name = person1.getName();
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
    }
}
