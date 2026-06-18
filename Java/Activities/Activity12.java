package Activity;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity12 {

	public static void main(String[] args) {

        // Create objects
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        Random indexGen = new Random();

        // Accept inputs (let's take 5 numbers)
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }

        // Generate random index
        int randomIndex = indexGen.nextInt(list.size());

        // Print value at random index
        System.out.println("Random Index: " + randomIndex);
        System.out.println("Value at that index: " + list.get(randomIndex));

        scan.close();
    }
}