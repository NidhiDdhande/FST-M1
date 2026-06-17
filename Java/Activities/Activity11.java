package Activity;

interface Addable {
    int add(int num1, int num2);
}

public class Activity11 {

	public static void main(String[] args) {

        // Lambda without body (single expression)
        Addable ad1 = (num1, num2) -> num1 + num2;

        // Lambda with body
        Addable ad2 = (num1, num2) -> {
            int result = num1 + num2;
            return result;
        };

        // Test both
        System.out.println("Result from ad1: " + ad1.add(10, 20));
        System.out.println("Result from ad2: " + ad2.add(5, 15));
    }
}