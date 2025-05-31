import world.Plant;

/* Quick guide to modifiers:
 * private = only within same class
 * public = from anywhere
 * protected = same class, subclass, and package
 * no modifier = same package only
 */

public class PublicPrivateProtected {
    public static void main(String[] args) {
        Plant plant = new Plant();

        System.out.println(plant.name);
        System.out.println(plant.ID);

        // type cannot be accessed because it is private
        // System.out.println(plant.type);

        // .size is protected, Plant.java is not in the same package
        // System.out.println(plant.size);

        // Error; because .height is not in the same package
        // System.out.println(plant.height);
    }
}
