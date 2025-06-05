public class Polymorphism {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        Tree tree1 = new Tree();

        // Even if plant 2 is in the Plant class, it points to the Tree class
        // Plant plant2 --> Tree tree1 --> Tree class grow() method
        // plant2 --> Tree class grow() method
        Plant plant2 = tree1;

        // Outputs Tree class grow method instead of Plant class
        plant2.grow();
        tree1.shedLeaves();

        doGrow(tree1);      // Uses Tree class
        doGrow(plant1);     // Uses Plant class
    }
    // doGrow() will use the grow() method from the class of the variable being inputted
    // Input must be class or subclass of Plant
    public static void doGrow(Plant plant) {
        plant.grow();
    }
}
