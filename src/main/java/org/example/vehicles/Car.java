package org.example.vehicles;

import org.example.vehicles.Vehicle;

public class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, int speed, int numberOfDoors) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void accelerate(){
        speed += 10;
    }

    @Override
    public String getFeatures() {
        return getCarInfo();
    }

    public String getCarInfo(){
        String features = super.getFeatures();
        return features + " and has " + numberOfDoors + " doors";
    }
}
