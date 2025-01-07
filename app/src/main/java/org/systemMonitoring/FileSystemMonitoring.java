package org.systemMonitoring;

import java.util.List;

import oshi.SystemInfo;
import oshi.software.os.FileSystem;
import oshi.software.os.OSFileStore;

public class FileSystemMonitoring {
    public static void displayFileSystemInfo() {
        SystemInfo systemInfo = new SystemInfo();
        FileSystem fileSystem = systemInfo.getOperatingSystem().getFileSystem();
        List<OSFileStore> fileStores = fileSystem.getFileStores();

        System.out.println("File System Information:");
        for (OSFileStore fs : fileStores) {
            System.out.printf("Mount: %s, Total Space: %.2f GB, Usable Space: %.2f GB\n",
                    fs.getMount(), fs.getTotalSpace() / 1e9, fs.getUsableSpace() / 1e9);
        }
    }
}