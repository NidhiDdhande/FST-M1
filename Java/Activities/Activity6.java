package Activity;

public class Activity6 {

	public static void main(String[] args) {

        Plane plane = new Plane();

        plane.boardPassengers(120);
        plane.takeOff("2026-06-12");
        plane.land("2026-06-12");

        System.out.println("Passengers: " + plane.getPassengers());
    }
}