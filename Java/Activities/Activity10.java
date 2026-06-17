package Activity;

import java.util.HashMap;
import java.util.Map;

public class Activity10 {

	public static void main(String[] args) {

        // Create Map
        Map<Integer, String> colours = new HashMap<>();

        // Add 5 colours
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Green");
        colours.put(4, "Yellow");
        colours.put(5, "Black");

        // Print Map
        System.out.println("Colours Map: " + colours);

        // Remove one colour
        colours.remove(3);

        // Check if "Green" exists
        System.out.println("Contains Green: " + colours.containsValue("Green"));

        // Print size
        System.out.println("Size: " + colours.size());
    }
}