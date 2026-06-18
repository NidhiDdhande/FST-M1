package Activity;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Activity14 {

	public static void main(String[] args){

        try {
            // Create file object
            File file = new File("sample.txt");

            // Create new file
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Write text into file
            FileWriter writer = new FileWriter(file);
            writer.write("Hello, this is a sample text written to the file.");
            writer.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}