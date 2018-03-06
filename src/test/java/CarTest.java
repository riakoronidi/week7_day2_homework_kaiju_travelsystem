import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {

    Car car;

    @Before
    public void setUp() throws Exception {
        car = new Car(51.34, "Audi A3");
    }

    @Test
    public void testCanGetPetrolCost() {
        assertEquals("Petrol for this journey cost £51.34", car.getPetrol());
    }
}
