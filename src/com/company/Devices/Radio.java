package com.company.Devices;

public class Radio extends ElectricDevice {

    public Radio(String brand, String color) {
        super(brand, color);
    }


    @Override
    public void turnOn() {
        setDeviceOn(true);
        System.out.println("The radio is turned on and singing music.");
    }

    @Override
    public void turnOff() {
        setDeviceOn(false);
        System.out.println("The radio is turned off and now I can hear my dreams.");
    }

    @Override
    public boolean isTurnedOn() {
        return isDeviceOn();
    }
}
