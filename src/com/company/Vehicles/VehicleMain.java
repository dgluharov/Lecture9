package com.company.Vehicles;

public class VehicleMain {
    public static void main(String[] args) {
        Car car = new Car();
        Cycle cycle = new Cycle();
        goBackward(car);
        goForward(cycle);
    }

    static void goForward(Vehicle vehicle) {
        vehicle.moveForward();
    }

    static void goBackward(Vehicle vehicle) {
        vehicle.moveBackward();
    }
}
