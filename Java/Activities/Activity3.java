package Activity;

public class Activity3 {

    public static String adjustDevice(String device, int value) {

        String status;

        if (device == null) {
            status = "Invalid device.";
        } else {
            switch (device) {

                case "THERMOSTAT":
                    if (value >= 40) {
                        status = "[Thermostat] Warning: Temperature high.";
                    } else {
                        status = "[Thermostat] Temperature is set to " + value + ".";
                    }
                    break;

                case "LIGHT":
                    status = "[Light] Adjusting brightness to " + value + "%.";
                    break;

                default:
                    status = "Unknown device.";
            }
        }

        return status;
    }

    // Optional main method for testing
    public static void main(String[] args) {

        System.out.println(adjustDevice("THERMOSTAT", 45));
        System.out.println(adjustDevice("THERMOSTAT", 30));
        System.out.println(adjustDevice("LIGHT", 75));
        System.out.println(adjustDevice(null, 50));
    }
}
