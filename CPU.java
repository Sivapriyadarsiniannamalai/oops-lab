import java.util.*;

class CPU {
    int price;

    
    public CPU(int price) {
        this.price = price;
    }

  
    class Processor {
        int cores;
        String producer;

        
        Processor(int noc, String manu) {
            cores = noc;
            producer = manu;
        }

        
        void display() {
            System.out.println("\nProcessor Info");
            System.out.println("No. of Cores = " + cores);
            System.out.println("Manufacturer = " + producer + "\n");
        }
    }

    
    static class Ram {
        int mem;
        String manuf;

        
        Ram(int memory, String producer) {
            mem = memory;
            manuf = producer;
        }

        
        void display() {
            System.out.println("\nRAM Info");
            System.out.println("Memory = " + mem + " GB");
            System.out.println("Manufacturer = " + manuf + "\n");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter RAM size in GB: ");
        int ramSize = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter RAM manufacturer: ");
        String ramManufacturer = sc.nextLine();

     
        System.out.print("Enter number of processor cores: ");
        int processorCores = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter processor manufacturer: ");
        String processorManufacturer = sc.nextLine();

        
        CPU obj2 = new CPU(); 
        CPU.Ram obj1 = new CPU.Ram(ramSize, ramManufacturer);  
        CPU.Processor obj3 = obj2.new Processor(processorCores, processorManufacturer); 

        
        obj1.display();
        obj3.display();
    }
}






























































/*import java.util.*; 
 class cpu
    {
     int price;
     public cpu(int price)
     {
       this.price=price;
     }
     
     class processor
       {
         int cores;
         String producer;
         processor(int noc,String manu)
         {
          cores=noc;
          producer=manu;
         }
         void display() 
         {
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
    

   public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter RAM size in GB: ");
        int ramSize = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter RAM manufacturer: ");
        String ramManufacturer = sc.nextLine();
        System.out.print("Enter number of processor cores: ");
        int processorCores = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter processor manufacturer: ");
        String processorManufacturer = sc.nextLine();
        cpu obj2 = new cpu();
        cpu.ram obj1 = new cpu.ram(ramSize, ramManufacturer);
        cpu.processor obj3 = obj2.new processor(processorCores, processorManufacturer);
        
        obj1.display();
        obj3.display();
   
   }
  }

     
     
     
     
     
  
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
 /*,Algorithm
Import Scanner Library
Import java.util.Scanner to read user input.
Define the cpu Class
Declare an instance variable price (optional).
Define the Inner Class processor:
Declare attributes cores and producer.
Create a constructor to initialize these attributes.
Define a display() method to print the processor details.
Define the Static Nested Class ram:
Declare attributes mem (memory) and manuf (manufacturer).
Create a constructor to initialize these attributes.
Define a display() method to print the RAM details.
Implement the main() Method
Create a Scanner object to read user input.
Input for RAM:
Prompt the user to enter the RAM size (in GB).
Read the RAM size.
Prompt the user to enter the RAM manufacturer.
Read the RAM manufacturer.
Input for Processor:
Prompt the user to enter the number of processor cores.
Read the number of cores.
Prompt the user to enter the processor manufacturer.
Read the processor manufacturer.
Create Objects:
Instantiate the static nested class ram using the user inputs.
Instantiate the outer class cpu.
Using the cpu instance, instantiate the inner class processor with the user inputs.
Display Information:
Call the display() method on the RAM object.
Call the display() method on the processor object.
Close the Scanner object.*/



    
     
     
     
     
     
     
     
     
     
     
     
     
     
