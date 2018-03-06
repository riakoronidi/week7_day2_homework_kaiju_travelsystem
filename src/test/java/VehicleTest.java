import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle vehicle;
    Bus bus;
    Boat boat;

    @Before
    public void setUp() throws Exception {
        vehicle = new Vehicle(120.3);
        bus = new Bus(2.70, "B12");
        boat = new Boat(12.50,"Ikaria");
    }

    @Test
    public void testCanAddBusToVehicle() {
        vehicle.move(bus);
        assertEquals(1, vehicle.vehicleCount());
    }
}
