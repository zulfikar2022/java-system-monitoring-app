package org.systemMonitoring;

import oshi.SystemInfo;
import oshi.hardware.CentralProcessor;
import oshi.hardware.HardwareAbstractionLayer;

public class CPUMonitoring {
    public static void displayCPUInfo() {
        SystemInfo systemInfo = new SystemInfo();
        HardwareAbstractionLayer hardware = systemInfo.getHardware();
        CentralProcessor processor = hardware.getProcessor();

        System.out.println("\n--- CPU Monitoring ---");
        System.out.println("Processor: " + processor.getProcessorIdentifier().getName());
        System.out.println("Physical Cores: " + processor.getPhysicalProcessorCount());
        System.out.println("Logical Cores: " + processor.getLogicalProcessorCount());
        // System.out.println("System Load: " + processor.getSystemCpuLoadBetweenTicks()
        // * 100 + "%");
    }
}
