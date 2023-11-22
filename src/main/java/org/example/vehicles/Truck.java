package org.example.vehicles;

import org.example.vehicles.Vehicle;

public class Truck extends Vehicle{
    private boolean isLoaded;

    private int loadCapacity;

    public Truck(String brand, int speed, boolean isLoaded, int loadCapacity) {
        super(brand, speed);
        this.isLoaded = isLoaded;
        this.loadCapacity = loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void accelerate() {
        speed += 15;
    }
    @Override
    public String getFeatures() {
        return getTruckInfo();
    }

    public String getTruckInfo() {
        String features = super.getFeatures();
        var isLoadedInfo = isLoaded ? " and is loaded" : " and is not loaded";
        return features + isLoadedInfo + " and it's current capacity is " + loadCapacity + "kg";
    }
}