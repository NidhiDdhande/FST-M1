package Activity;

public class Plane {

    // Private variables (data hiding)
    private int passengers;
    private String takeOffDate;
    private String landingDate;

    // Method to board passengers
    public void boardPassengers(int count) {
        if (count > 0) {
            passengers += count;
        }
    }

    // Method to take off
    public void takeOff(String date) {
        this.takeOffDate = date;
        System.out.println("Plane took off on: " + takeOffDate);
    }

    // Method to land
    public void land(String date) {
        this.landingDate = date;
        System.out.println("Plane landed on: " + landingDate);
    }

    // Getter methods
    public int getPassengers() {
        return passengers;
    }

    public String getTakeOffDate() {
        return takeOffDate;
    }

    public String getLandingDate() {
        return landingDate;
    }
}