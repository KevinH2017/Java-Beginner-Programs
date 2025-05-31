package world;

public class Oak extends Plant {
    public Oak() {
        // type is private and cannot be assigned here
        // type = "tree";

        this.size = "Extra Large";

        // Works because Oak.java and Plant.java are in the same package
        this.height = 10;
    }
}
