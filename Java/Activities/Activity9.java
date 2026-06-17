package Activity;

import java.util.HashSet;

public class Activity9 {

	public static void main(String[] args)  {

        // Create HashSet
        HashSet<String> hs = new HashSet<>();

        // Add 6 elements
        hs.add("A");
        hs.add("B");
        hs.add("C");
        hs.add("D");
        hs.add("E");
        hs.add("F");

        // Print size
        System.out.println("Size: " + hs.size());

        // Remove an element
        hs.remove("C");

        // Try removing element not present
        System.out.println("Remove 'Z': " + hs.remove("Z"));

        // Check if element exists
        System.out.println("Contains 'A': " + hs.contains("A"));

        // Print updated set
        System.out.println("Updated Set: " + hs);
    }
}