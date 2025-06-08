// Enums is a class that represent a group of constants
public class EnumTypes {
    public static void main(String[] args) {
        // Assigns variable Animal enum object from Animal.java
        Animal animal = Animal.CAT;
        // Runs case based on what switch value is
        switch (animal) {
            case BIRD:
                System.out.println("Bird");
                break;
            case CAT:
                System.out.println("Cat");
                break;
            case DOG:
                System.out.println("Dog");
                break;
            default:
                break;
        }

        System.out.println(Animal.DOG);                     // "This animal's name is Lassie"
        System.out.println("Enum name as a string: " + Animal.DOG.name());  // Gets the actual name of the enum Animal object
        System.out.println(Animal.DOG.getClass());          // class Animal
        System.out.println(Animal.DOG instanceof Animal);   // Checks if an object is an instance of a specific class
        System.out.println(Animal.BIRD.getName());          // Gets name of BIRD object from enum Animal
        
        Animal animal2 = Animal.valueOf("CAT");             // Gets the value of CAT object from enum Animal
        System.out.println(animal2);
    }
}
