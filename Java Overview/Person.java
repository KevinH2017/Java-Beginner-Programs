/**
 * The Person class represents a person with a unique identifier and a name
 * It provides methods to access and modify these attributes, as well as to compare
 * Person objects for equality and generate hash codes
 *
 * Example:
 *     Person person = new Person(1, "Alice");
 *     String name = person.getName();
 *     int id = person.getId();
 * 
 *   Private fields: name String, Id int
 *   Constructor to initialize Id and name
 *   Getters and setters for both fields
 *   Overrides equals(), hashCode(), and toString() methods
 */
public class Person {
    // private variables cannot be modified outside of their class
    private String name;
    private int Id;

    // Constructor sets the initial values for object attributes
    public Person(int Id, String name) {
        this.Id = Id;
        this.name = name;
    }

    // Getters and Setters for String name and int Id
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return Id;
    }
    public void setId(int id) {
        Id = id;
    }

    // Overrides the default toString() method
    @Override
    public String toString() {
        return super.toString();
    }

    // Hashcodes are unique integers as an identifier for a specific object
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Id != other.Id)
            return false;
        return true;
    }

}