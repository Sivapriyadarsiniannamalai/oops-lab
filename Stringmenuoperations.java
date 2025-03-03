import java.util.*;

class StringMenu {
    String str; // Stores the main string

    // Read a string from user input
    public void read(Scanner sc) {
        System.out.print("Enter the string: ");
        str = sc.nextLine();
    }

    // Display the current string
    public void display() {
        System.out.println("Current String: " + str);
    }

    // Copy the string and display it
    public void copyString() {
        String copiedString = str; // Simple copy operation
        System.out.println("Copied String: " + copiedString);
    }

    // Find and display the length of the string
    public void getLength() {
        System.out.println("Length of String: " + str.length());
    }

    // Concatenate another string to the existing string
    public void concatenate(Scanner sc) {
        System.out.print("Enter another string to concatenate: ");
        String anotherString = sc.nextLine();
        str = str + anotherString; // Concatenation
        System.out.println("After Concatenation: " + str);
    }

    // Compare the stored string with another user-input string
    public void compareString(Scanner sc) {
        System.out.print("Enter another string to compare: ");
        String anotherString = sc.nextLine();

        if (str.equals(anotherString)) {
            System.out.println("Strings are equal.");
        } else {
            System.out.println("Strings are NOT equal.");
        }
    }

    public static void main(String[] args) {
        StringMenu obj = new StringMenu();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n1) Enter String");
            System.out.println("2) Display String");
            System.out.println("3) Copy String");
            System.out.println("4) Find Length of String");
            System.out.println("5) Concatenate String");
            System.out.println("6) Compare String");
            System.out.println("7) Exit");

            System.out.print("Choose an option: ");
            int option = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    obj.read(sc);
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    obj.copyString();
                    break;
                case 4:
                    obj.getLength();
                    break;
                case 5:
                    obj.concatenate(sc);
                    break;
                case 6:
                    obj.compareString(sc);
                    break;
                case 7:
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option! Try again.");
            }
        }
    }
}
