// Encapsulation is the act of bundling variables and methods into a class
// This helps keep code more flexible and easier to maintain, as well as
// helps to prevent data from being accidentally accessed from other sources
// and be more secure

class Plant {
    public static final int ID = 7;
    private String name;

    public String getData() {
        String data = "Data: " + calculateGrowthForecast();
        return data;
    }

    private int calculateGrowthForecast() {
        return 9;
    }

    // private variable Getter
    public String getName() {
        return name;
    }
    // private variable Setter
    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.setName("Sunflower");        // Sets variable name
        System.out.println(plant1.getName());    // Gets variable name

        System.out.println(plant1.getData());
    }
}
