package org.systemMonitoring;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;

public class CPUMonitoring {
    public static void displayCPUInfo() {

        CentralProcessor processor = new SystemInfo().getHardware().getProcessor();

        System.out.println();

        System.out.println("\n--- CPU Monitoring ---");
        System.out.println("Processor: " + processor.getProcessorIdentifier().getName());
        System.out.println("Physical Cores: " + processor.getPhysicalProcessorCount());
        System.out.println("Logical Cores: " + processor.getLogicalProcessorCount());

    }
}
