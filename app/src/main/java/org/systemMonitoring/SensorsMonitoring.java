package org.systemMonitoring;

import oshi.SystemInfo;
import oshi.hardware.Sensors;

public class SensorsMonitoring {
    public static void displaySensorsInfo() {
        SystemInfo systemInfo = new SystemInfo();
        Sensors sensors = systemInfo.getHardware().getSensors();

        System.out.printf("CPU Temperature: %.1f°C\n", sensors.getCpuTemperature());
        System.out.printf("Fan Speeds: %s\n", java.util.Arrays.toString(sensors.getFanSpeeds()));
        System.out.printf("CPU Voltage: %.1fV\n", sensors.getCpuVoltage());
    }
}