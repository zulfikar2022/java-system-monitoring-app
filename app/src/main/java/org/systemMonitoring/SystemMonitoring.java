package org.systemMonitoring;

import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;

public class SystemMonitoring {
    public static void displaySystemInfo() {
        SystemInfo systemInfo = new SystemInfo();
        OperatingSystem os = systemInfo.getOperatingSystem();

        System.out.printf("Operating System: %s %s (%s)\n",
                os.getFamily(), os.getVersionInfo().getVersion(), os.getBitness() + "-bit");

        System.out.printf("Uptime: %d seconds\n", os.getSystemUptime());
    }
}