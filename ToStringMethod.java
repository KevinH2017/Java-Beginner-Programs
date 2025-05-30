class Frog {
    private int id;
    private String name;

    public Frog(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Must return a string value
    public String toString() {
        // Efficient way to combine integers and strings into the same variable
        // StringBuilder sb = new StringBuilder();
        // sb.append(id)
        // .append(": ")
        // .append(name);
        // return sb.toString();

        // In-line formatting
        return String.format("%-3d: %s", id, name);
    }
}

public class ToStringMethod {
    public static void main(String[] args) {
        Frog frog1 = new Frog(3, "Frogger");
        Frog frog2 = new Frog(7, "Kermit");

        // System.out.println() by default uses the toString() method to find the string representation of an object
        System.out.println(frog1);
        System.out.println(frog2);
    }
}
