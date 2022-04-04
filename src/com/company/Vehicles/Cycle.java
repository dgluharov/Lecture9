package com.company.Vehicles;

public class Cycle implements Vehicle {
    @Override
    public void moveForward() {
        System.out.println("Push the pedals and move forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Push the pedals and move backward");
    }
}
