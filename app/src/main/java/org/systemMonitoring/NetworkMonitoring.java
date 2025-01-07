package org.systemMonitoring;

import oshi.SystemInfo;
import oshi.hardware.NetworkIF;

public class NetworkMonitoring {
    public static void displayNetworkInfo() {
        SystemInfo systemInfo = new SystemInfo();
        var networkIFs = systemInfo.getHardware().getNetworkIFs();

        System.out.println("Network Interfaces:");
        for (NetworkIF net : networkIFs) {
            System.out.printf("Name: %s, MAC Address: %s, Speed: %d Mbps\n",
                    net.getName(), net.getMacaddr(), net.getSpeed() / 1_000_000);
        }
    }
}
