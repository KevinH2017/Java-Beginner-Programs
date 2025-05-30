class Frog {
    // private variables can only be accessed within the class it is declared so that it cannot be changed outside of the class
    // This is for controlling access to variables and for flexibility
    private String name;
    private int age;

    // this. is used to point to an object even if they are private
    public void SetName(String name) {
        this.name = name;
    }
    public void SetAge(int age) {
        this.age = age;
    }

    public String GetName() {
        return name;
    }
    public int GetAge() {
        return age;
    }

    public void SetInfo(String name, int age) {
        SetName(name);
        SetAge(age);
    }
}

public class SettersAndThis {
    public static void main(String[] args) {
        Frog frog1 = new Frog();

        // The fields name and age are not visible and cannot be changed here
        // frog1.name = "Froggie";
        // frog1.age = 1;

        // The fields can be changed below because private variables are not being used
        frog1.SetName("Froggie");
        frog1.SetAge(1);

        System.out.println(frog1.GetName());
        System.out.println(frog1.GetAge());
    }
}
