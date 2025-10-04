import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexDataStructures {

    // One-dimensional array
    public static String[] vehicles = {
        "ambulance", "helicopter", "ship"
    };

    // Two-dimensional array
    public static String[][] drivers = {
        {"Fred", "Sue", "Pete"},
        {"Sue", "Richard", "Bob", "Fred"},
        {"Pete", "Mary", "Bob"}
    };

    public static void main(String[] args) {
        // System.out.println(vehicles[2]);        // Element 2 : ship
        // System.out.println(drivers[0][1]);      // Row 0, Element 1 : Sue
        
        Map<String, Set<String>> personnel = new HashMap<String, Set<String>>();

        for (int i=0; i<vehicles.length; i++) {
            String vehicle = vehicles[i];
            String[] driversList = drivers[i];

            Set<String> driverSet = new LinkedHashSet<String>();

            for (String driver : driversList) {
                driverSet.add(driver);
            }

            personnel.put(vehicle, driverSet);
        }

        // Brackets changes scope of driversList variable, avoiding duplicates error
        {
            // Gets all personnel that have vehicle "helicopter" as their key 
            Set<String> driversList = personnel.get("helicopter");

            // "helicopter" is vehicles[1], so the driversList is all values from drivers[1]
            for (String driver : driversList) {
                System.out.println(driver);
            }
        }

        // Iterates through all personnel and prints the vehicles with their drivers
        for (String vehicle : personnel.keySet()) {
            System.out.print(vehicle + ": ");

            // Gets all personnel and their vehicle
            Set<String> driversList = personnel.get(vehicle);

            for (String driver : driversList) {
                System.out.print(driver + " ");
            }
            System.out.println();
        } 
    }
}
