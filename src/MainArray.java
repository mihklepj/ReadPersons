import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainArray {
    public static void main(String[] args) {
        List<String> dynamicCities = new ArrayList<>(List.of("Tallinn", "Riga", "Vilnius", "Helsinki"));
        // List size
        System.out.println(dynamicCities.size());
        show(dynamicCities);

        // Add new city to list
        dynamicCities.add("Amsterdam");
        dynamicCities.add("Stockholm");
        show(dynamicCities);

        // Get Riga from list and show
        System.out.println(dynamicCities.get(1));

        // Add new city to index 2
        dynamicCities.add(2, "New York");
        show(dynamicCities);

        // Change Amsterdam to Boston
        dynamicCities.set(5, "Boston");
        show(dynamicCities);

        // Remove last city
        dynamicCities.remove(dynamicCities.size()-1);
        show(dynamicCities);

        dynamicCities.remove(dynamicCities.indexOf("New York"));
        show(dynamicCities);

        // Create new String list with names
        List<String> names; // Create variable
        names = new ArrayList<>(); // Create empty list
        names.add("Marko");
        names.add("Juhan");
        names.add("Mari");
        // TASK: Show List size and all elements
        System.out.println(names.size());
        show(names);
    }



    /**
     * Show dynamic cities list contents
     * @param cities cities list
     */
    private static void show(List<String> cities) {
        for(String city : cities) {
            System.out.print(city + " ");
        }
        System.out.println();
    }
}
