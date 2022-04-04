package com.company.Devices;

public class DeviceMain {
    public static void main(String[] args) {
        TV tv = new TV("Samsung", "Black");
        Radio radio = new Radio("Sony", "Silver");

        System.out.println(tv.isDeviceOn());
        tv.turnOn();
        System.out.println(tv.isDeviceOn());
        tv.turnOff();
        System.out.println(tv.isDeviceOn());
    }
}
