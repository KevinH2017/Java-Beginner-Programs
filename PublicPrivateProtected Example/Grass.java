import world.Plant;

public class Grass extends Plant{
    public Grass() {
        // Grass.java is not in the same package as Plant.java, even if it is a subclass
        // System.out.println(this.height);
    }
}
