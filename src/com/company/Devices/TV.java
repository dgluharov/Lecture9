package com.company.Devices;

public class TV extends ElectricDevice {

    public TV(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void turnOn() {
        setDeviceOn(true);
        System.out.println("The TV is turned on and playing a movie.");
    }

    @Override
    public void turnOff() {
        setDeviceOn(false);
        System.out.println("The TV is turned off and now I can hear my dreams.");
    }

    @Override
    public boolean isTurnedOn() {
        return isDeviceOn();
    }
}
