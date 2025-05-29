class Person {
    String name;
    int age;

    void speak() {
        System.out.println("My name is: " + name );
    }
    // Method calculates and returns int yearsLeft variable
    int CalculateYearsToRetirement() {
        int yearsLeft = 65 - age;

        return yearsLeft;
    }

    // Method returns int age variable
    int GetAge() {
        return age;
    }

    // Method returns String name variable
    String GetName() {
        return name;
    }
}

public class GettersAndReturn {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "John";
        person1.age = 43;

        // person1.speak();
        
        int years = person1.CalculateYearsToRetirement();
        System.out.println(years + " years until retirement.");

        // Gets age and name from class Person methods GetAge() and GetName()
        int age = person1.GetAge();
        String name = person1.GetName();
        System.out.println("My name is: " + name);
        System.out.println("My age is: " + age);
    }
}
