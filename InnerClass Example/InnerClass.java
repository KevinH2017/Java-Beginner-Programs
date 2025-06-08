public class InnerClass {
    public static void main(String[] args) {
        Robot robot =  new Robot(5);
        robot.start();

        // Accesses Brain class inside of Robot class
        // and creates a new variable, brain adding onto 
        // variable robot from above
        // Robot.Brain brain = robot.new Brain();
        // brain.think();

        // Accesses Battery class inside of Robot class
        Robot.Battery battery = new Robot.Battery();
        battery.charge();
    }
}
