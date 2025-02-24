import java.util.Scanner;

public class cpu {
    int price;

    class processor {
        int cores;
        String producer;

        processor(int noC, String manu) {
            cores = noC;
            producer = manu;
        }

        void display() {
            System.out.println("\nProcessor info");
            System.out.println("No. of Cores = " + cores);
            System.out.println("Manufacturer = " + producer + "\n");
        }
    }

    static class ram {
        int mem;
        String manuf;

        ram(int memory, String producer) {
            mem = memory;
            manuf = producer;
        }

        void display() {
            System.out.println("\nRAM info");
            System.out.println("Memory = " + mem + " GB");
            System.out.println("Manufacturer = " + manuf + "\n");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for RAM
        System.out.print("Enter RAM size (in GB): ");
        int ramSize = sc.nextInt();
        sc.nextLine(); // Consume the newline
        System.out.print("Enter RAM manufacturer: ");
        String ramManufacturer = sc.nextLine();

        // Taking input for Processor
        System.out.print("Enter number of processor cores: ");
        int processorCores = sc.nextInt();
        sc.nextLine(); // Consume the newline
        System.out.print("Enter processor manufacturer: ");
        String processorManufacturer = sc.nextLine();

        // Creating objects
        cpu.ram obj1 = new cpu.ram(ramSize, ramManufacturer);
        cpu obj2 = new cpu();
        cpu.processor obj3 = obj2.new processor(processorCores, processorManufacturer);

        // Displaying results
        obj1.display();
        obj3.display();

        //sc.close();
    }
}
