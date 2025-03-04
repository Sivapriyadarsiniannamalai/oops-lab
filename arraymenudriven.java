import java.util.Scanner;
import java.util.Arrays;

public class ArrayMenuDriven {

    // Method to search a string in the array
    public static void searchString(String[] array, String target) {
        boolean found = false;
        for (String str : array) {
            if (str.equals(target)) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("'" + target + "' found in the array.");
        } else {
            System.out.println("'" + target + "' not found in the array.");
        }
    }

    // Method to sort the array
    public static void sortArray(String[] array) {
        Arrays.sort(array);
        System.out.println("Array sorted: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input array size and elements
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline left by nextInt()

        String[] array = new String[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }

        while (true) {
            // Display the menu
            System.out.println("\nMenu:");
            System.out.println("1. Search a string from the array");
            System.out.println("2. Sort the array");
            System.out.println("3. Exit");

            System.out.print("Enter your choice (1/2/3): ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline left by nextInt()

            switch (choice) {
                case 1:
                    System.out.print("Enter the string to search: ");
                    String target = scanner.nextLine();
                    searchString(array, target);
                    break;

                case 2:
                    sortArray(array);
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
