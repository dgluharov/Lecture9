package com.company.Devices;

public abstract class ElectricDevice implements Device {
    String brand;
    String color;
    boolean deviceOn;

    public ElectricDevice(String brand, String color) {
        this.brand = brand;
        this.color = color;
        this.deviceOn = false;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isDeviceOn() {
        return deviceOn;
    }

    public void setDeviceOn(boolean deviceOn) {
        this.deviceOn = deviceOn;
    }
}
