/**
 * The {@code Person} class represents a person with a unique identifier and a name.
 * It provides methods to access and modify these attributes, as well as to compare
 * {@code Person} objects for equality and generate hash codes.
 * <p>
 * Example usage:
 * <pre>
 *     Person person = new Person(1, "Alice");
 *     String name = person.getName();
 *     int id = person.getId();
 * </pre>
 * </p>
 *
 * <ul>
 *   <li>Private fields: {@code name} (String), {@code Id} (int)</li>
 *   <li>Constructor to initialize {@code Id} and {@code name}</li>
 *   <li>Getters and setters for both fields</li>
 *   <li>Overrides {@code equals()}, {@code hashCode()}, and {@code toString()} methods</li>
 * </ul>
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