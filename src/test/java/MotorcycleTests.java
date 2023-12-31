import org.junit.jupiter.api.Test;
import org.example.vehicles.Motorcycle;
import org.example.vehicles.Vehicle;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MotorcycleTests {

    @Test
    public void testGetMotorcycleInfoHasSidecar(){
        var brand = "Honda";
        var speed = 20;
        var hasSidecar = true;
        var motorcycle = new Motorcycle(brand, speed, hasSidecar);

        var expected = "My " + brand + " is traveling at " + speed + " km/h "
                + "and has sidecar";
        var actual = motorcycle.getMotorcycleInfo();

        assertEquals(expected, actual);
    }

    @Test
    public void testGetMotorcycleInfoNoSidecar(){
        var brand = "Honda";
        var speed = 20;
        var hasSidecar = false;
        var motorcycle = new Motorcycle(brand, speed, hasSidecar);

        var expected = "My " + brand + " is traveling at " + speed + " km/h "
                + "and has no sidecar";
        var actual = motorcycle.getMotorcycleInfo();

        assertEquals(expected, actual);
    }

    @Test
    public void testAccelerateMotorcycle(){
        var mc = new Motorcycle("Bose", 0, true);
        mc.accelerate();

        var expected = 15;
        var actual = mc.getSpeed();

        assertEquals(expected, actual);
    }
}
