package com.company.Vehicles;

public class Car implements Vehicle {
    @Override
    public void moveForward() {
        System.out.println("Grab the steering wheel and move forward");
    }

    @Override
    public void moveBackward() {
        System.out.println("Grab the steering wheel and move backward");
    }
}
