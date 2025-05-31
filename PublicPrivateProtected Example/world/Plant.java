package world;

public class Plant {
    // public variables are bad practice, they can be accessed anywhere and changed without permission
    public String name;

    // final static variables cannot be changed elsewhere
    public final static int ID = 5;

    // private can only be accessed in this class
    private String type;

    // protected can be accessed within the class and sub classes and packages
    protected String size;

    int height;

    public Plant() {
        this.name = "Sunflower";
        this.type = "Tree";
        this.size = "Large";
        this.height = 8;
    }
}
