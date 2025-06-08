class Person {
    private int id;
    private String name;
    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + "]";
    }

    // Overwrites .equals() to in-depth check if two values are referencing the same object
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}

// It is best practice to use == to compare if two objects are the same and to use
// .equals() to comparing two values
public class EqualsMethod {
    public static void main(String[] args) {
        Person person1 = new Person(1, "John");
        Person person2 = new Person(2, "Smith");

        // Same values, but different references
        Person person3 = new Person(3, "Bob");
        Person person4 = new Person(3, "Bob");

        // == is not the same as .equals()
        // == Checks if two references are pointing to the same object in memory,
        // not if they have the same value
        System.out.println(person1 == person2);             // false since both have different values

        System.out.println(person3 == person4);             // false, since both are referencing different objects in memory
        System.out.println(person3.equals(person4));        // true, since .equals() is changed by hashCode() in Person class

        Double double1 = 7.7;
        Double double2 = 7.7;

        // System.out.println(double1 == double2);             // false, Doubles don't point to the same object even if they have the same value
        System.out.println(double1.equals(double2));            // true, .equals() checks if they reference the same object in memory

        Integer num1 = 5;
        Integer num2 = 5;

        // System.out.println(num1 == num2);                   // true, Integers point to the same object if they have the same value
        System.out.println(num1.equals(num2));                  // true, .equals() checks if they reference the same object in memory

        String text1 = "Hello";
        String text2 = "Hello";

        System.out.println(text1 == text2);                     // true, Strings automatically point the same strings to the same object in memory
        System.out.println(text1.equals(text2));                // true, .equals() also works here

        String text3 = "Hello";
        String text4 = "Helloasdf".substring(0, 5);     // Start at String index 0 and end before index 5

        System.out.println(text3 == text4);                     // false, both Strings are still pointing to different objects in memory
        System.out.println(text3);                              // Prints Hello
        System.out.println(text4);                              // Also prints Hello because of .substring(0, 5), getting the first five characters of text4
        System.out.println(text3.equals(text4));                // true, .substring() changes text4 to "Hello", making it equal to text3 "Hello"
    }
}
