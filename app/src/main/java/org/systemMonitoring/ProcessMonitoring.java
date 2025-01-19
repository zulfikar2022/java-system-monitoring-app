package org.systemMonitoring;

import oshi.SystemInfo;
import oshi.software.os.OSProcess;
import oshi.software.os.OperatingSystem;

import java.util.List;

public class ProcessMonitoring {
    public static void displayProcessInfo() {
        SystemInfo systemInfo = new SystemInfo();
        OperatingSystem os = systemInfo.getOperatingSystem();

        // Fetch all processes
        List<OSProcess> processes = os.getProcesses();

        // Sort the processes by CPU usage in descending order
        processes.sort((p1, p2) -> Double.compare(p2.getProcessCpuLoadCumulative(), p1.getProcessCpuLoadCumulative()));

        System.out.println();
        System.out.println("Top Processes by CPU Usage:");
        int count = 0;
        for (OSProcess process : processes) {
            if (count >= 5)
                break; // Display only the top 5 processes
            System.out.printf("PID: %d, Name: %s, CPU: %.2f%%%n",
                    process.getProcessID(), process.getName(), 100d * process.getProcessCpuLoadCumulative());
            count++;
        }
    }
}
