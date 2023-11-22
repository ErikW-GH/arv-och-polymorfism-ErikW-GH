package org.example.vehicles;

public class Motorcycle extends Vehicle{
    private boolean hasSidecar;

    public Motorcycle(String brand, int speed, boolean hasSidecar) {
        super(brand, speed);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public void accelerate() {
        speed += 15;
    }
    @Override
    public String getFeatures() {
        return getMotorcycleInfo();
    }
    public String getMotorcycleInfo(){
        String features = super.getFeatures();
        var sideCarInfo = hasSidecar ? " and has sidecar" : " and has no sidecar";
        return features + sideCarInfo;
    }
}
