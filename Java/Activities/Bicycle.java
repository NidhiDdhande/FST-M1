package Activity;

class Bicycle implements BicycleParts, BicycleOperations {

    int speed = 0;

    // Implement methods
    public void applyBrake(int decrement) {
        speed -= decrement;
        if (speed < 0) {
            speed = 0;
        }
        System.out.println("Speed after brake: " + speed);
    }

    public void speedUp(int increment) {
        speed += increment;
        if (speed > maxSpeed) {
            speed = maxSpeed;
        }
        System.out.println("Speed after speeding up: " + speed);
    }

    // Display details
    public void display() {
        System.out.println("Tyres: " + tyres);
        System.out.println("Max Speed: " + maxSpeed);
    }
}