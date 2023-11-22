package org.example;

import org.example.vehicles.Car;
import org.example.vehicles.Motorcycle;
import org.example.vehicles.Truck;
import org.example.vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n---- Polymorphism & Override ---");
        // Create empty list of Vehicles
        Vehicle[] vehicleArray = new Vehicle[3];
        vehicleArray[0] = new Car("Tesla",150,4);
        vehicleArray[1] = new Motorcycle("BMW", 350, true);
        vehicleArray[2] = new Truck("Ford", 50, true, 50000);

        // In another loop (foreach-loop):
        for(Vehicle vehicle : vehicleArray){
            System.out.println(vehicle.getFeatures());
        }
        // Get and print vehicle features

        System.out.println("\n---- Overloading ---");
        vehicleArray[0].startVehicle("Tesla key");
        vehicleArray[1].startVehicle(true);
    }


}