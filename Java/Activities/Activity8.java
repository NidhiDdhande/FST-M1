package Activity;

import java.util.ArrayList;

public class Activity8 {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<String> myList = new ArrayList<>();

        // Add 5 names
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.add("E");

        // Print all names using for loop
        System.out.println("Names in the list:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Get 3rd name
        System.out.println("3rd name: " + myList.get(2));

        // Check if a name exists
        System.out.println("Contains 'A'? " + myList.contains("A"));

        // Print size
        System.out.println("Size of list: " + myList.size());

        // Remove a name
        myList.remove("B");

        // Print size after removal
        System.out.println("Size after removal: " + myList.size());
    }
}