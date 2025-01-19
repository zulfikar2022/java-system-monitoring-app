package org.systemMonitoring;

import oshi.SystemInfo;
import oshi.hardware.GlobalMemory;

public class MemoryMonitoring {
    public static void displayMemoryInfo() {
        SystemInfo systemInfo = new SystemInfo();
        GlobalMemory memory = systemInfo.getHardware().getMemory();

        long totalMemory = memory.getTotal();
        long availableMemory = memory.getAvailable();
        System.out.println();
        System.out.println("\n--- Memory Monitoring ---");
        System.out.println("Total Memory: " + formatBytes(totalMemory));
        System.out.println("Available Memory: " + formatBytes(availableMemory));
        System.out.println("Used Memory: " + formatBytes(totalMemory - availableMemory));
    }

    private static String formatBytes(long bytes) {
        long kb = 1024;
        long mb = kb * 1024;
        long gb = mb * 1024;

        if (bytes >= gb) {
            return (bytes / gb) + " GB";
        } else if (bytes >= mb) {
            return (bytes / mb) + " MB";
        } else if (bytes >= kb) {
            return (bytes / kb) + " KB";
        } else {
            return bytes + " Bytes";
        }
    }
}
