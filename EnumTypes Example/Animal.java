public enum Animal {
    BIRD("Archimedes"), 
    CAT("Tom"), 
    DOG("Lassie");

    private String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Will print below string when called as String
    @Override
    public String toString() {
        return "This animal's name is " + name;
    }
}
