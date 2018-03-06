import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

    Vehicle vehicle;
    Bus bus;
    Boat boat;
    Car car;
    Plane plane;
    Traveller traveller;

    @Before
    public void setUp() throws Exception {
        vehicle = new Vehicle(120.3);
        bus = new Bus(2.70, "B12");
        boat = new Boat(12.50,"Ikaria");
        traveller = new Traveller("Ria", 100.00);
    }

    @Test
    public void testCanAddBusToVehicle() {
        vehicle.move(bus);
        vehicle.move(boat);
        vehicle.move(car);
        vehicle.move(plane);
        assertEquals(4, vehicle.vehicleCount());
    }

    @Test
    public void testCanAddTravellerToVehicle() {
        vehicle.addTraveller(traveller);
        assertEquals(1, vehicle.travellerCount());
    }
}
