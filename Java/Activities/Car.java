package Activity;

public class Car {

    String color;
    String transmission;
    int make;
    int tyres;
    int doors;

    // Constructor
    public Car(String color, String transmission, int make) {
        this.color = color;
        this.transmission = transmission;
        this.make = make;
        this.tyres = 4;
        this.doors = 4;
    }

    // Method to display 
    public void displayCharacteristics() {
        System.out.println("Color: " + color);
        System.out.println("Transmission: " + transmission);
        System.out.println("Make: " + make);
        System.out.println("Tyres: " + tyres);
        System.out.println("Doors: " + doors);
    }

    // Method to accelerate
    public void accelarate() {
        System.out.println("Car is moving forward.");
    }

    // Method to brake
    public void brake() {
        System.out.println("Car has stopped.");
    }
}
