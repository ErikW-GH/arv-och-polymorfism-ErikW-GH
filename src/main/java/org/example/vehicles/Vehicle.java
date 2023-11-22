package org.example.vehicles;

public class Vehicle {
    protected String brand;
    protected int speed;

    public Vehicle(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    public void startVehicle() {
        System.out.println("Start vehicle " + brand);

    }

    public void startVehicle(String key) {
        if (key.equals(brand + " key")) {
            System.out.println("Starting vehicle with " + brand + " key.");
        } else {
            System.out.println("Incorrect key. Vehicle cannot be started.");
        }
    }

    public void startVehicle(boolean isHotwired) {
        if (isHotwired) {
            System.out.println("Starting vehicle with hot-wire.");
            System.out.println("Contacting Police.");
        } else {
            System.out.println("Vehicle cannot be started without key or hot-wire.");
        }
    }

    public String getFeatures(){
        return "My " + brand + " is traveling at " + speed + " km/h";
    }

    public void accelerate(){
        speed += 5;
    }

    public int getSpeed(){
        return speed;
    }
}
