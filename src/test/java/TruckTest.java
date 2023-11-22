import org.example.vehicles.Truck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruckTest {
    @Test
    public void testGetTruckInfo(){
        boolean isLoaded;
        var brand = "Lamborghini";
        var speed = 50;
        isLoaded = true;
        var isLoadedInfo = isLoaded ? " and is loaded" : " and is not loaded";

        var loadCapacity = 50000;
        var truck = new Truck(brand, speed, isLoaded, loadCapacity);

        var expected = "My " + brand + " is traveling at " + speed + " km/h"
                + isLoadedInfo + " and it's current capacity is " + loadCapacity + "kg";
        var actual = truck.getTruckInfo();

        assertEquals(expected, actual);
    }
}
