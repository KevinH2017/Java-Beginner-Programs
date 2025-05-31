// Imports classes and methods from other files to use here
import ocean.*;                     // Imports Fish.java
import ocean.plants.*;              // Imports Seaweed.java and Algae.java
import ocean.plants.com.Aquarium;   // Imports Aquarium.java

public class Packages {
    public static void main(String[] args) {
        Fish fish1 = new Fish();
        Seaweed weed1 = new Seaweed();
        Algae algae1 = new Algae();

        Aquarium aquarium1 = new Aquarium();

        System.out.println("Fish: " + fish1.name);
        System.out.println("Seaweed: " + weed1.name);
        System.out.println("Algae: " + algae1.name);

        System.out.println("Aquarium: " + aquarium1.name);
    }
}
