package org.systemMonitoring;

import oshi.SystemInfo;
import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;

import java.util.List;

public class DiskMonitoring {
    public static void displayDiskInfo() {
        SystemInfo systemInfo = new SystemInfo();
        FileSystem fileSystem = systemInfo.getOperatingSystem().getFileSystem();
        List<OSFileStore> fileStores = fileSystem.getFileStores();

        System.out.println();
        System.out.println("\n--- Disk Monitoring ---");
        for (OSFileStore store : fileStores) {
            System.out.println("Drive: " + store.getMount());
            System.out.println("  Total Space: " + formatBytes(store.getTotalSpace()));
            System.out.println("  Usable Space: " + formatBytes(store.getUsableSpace()));
            System.out.println("  Used Space: " + formatBytes(store.getTotalSpace() - store.getUsableSpace()));
        }
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
