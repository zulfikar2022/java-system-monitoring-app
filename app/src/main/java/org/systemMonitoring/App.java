package org.systemMonitoring;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("System Monitoring Application");
        System.out.println("=============================");

        while (true) {
            try {
                System.out.println("\nChoose an option:");
                System.out.println("1. CPU Monitoring");
                System.out.println("2. Memory Monitoring");
                System.out.println("3. Disk Monitoring");
                System.out.println("4. Network Monitoring");
                System.out.println("5. Process Monitoring");
                System.out.println("6. System Monitoring");
                System.out.println("7. Sensors Monitoring");
                System.out.println("8. File System Information");
                System.out.println("9. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        CPUMonitoring.displayCPUInfo();
                        break;
                    case 2:
                        MemoryMonitoring.displayMemoryInfo();
                        break;
                    case 3:
                        DiskMonitoring.displayDiskInfo();
                        break;
                    case 4:
                        NetworkMonitoring.displayNetworkInfo();
                        break;
                    case 5:
                        ProcessMonitoring.displayProcessInfo();
                        break;
                    case 6:
                        SystemMonitoring.displaySystemInfo();
                        break;
                    case 7:
                        SensorsMonitoring.displaySensorsInfo();
                        break;
                    case 8:
                        FileSystemMonitoring.displayFileSystemInfo();
                        break;
                    case 9:
                        System.out.println("Exiting System Monitoring Application.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
    }
}
