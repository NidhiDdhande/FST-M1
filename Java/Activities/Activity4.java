package Activity;

public class Activity4 {

	public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1, 2};

        // Sort
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];     
            int j = i - 1;

            // Shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Actual Position
            arr[j + 1] = key;
        }

        // Print 
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}