import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BoatTest {

    Boat boat;

    @Before
    public void setUp() throws Exception {
        boat = new Boat(12.50,"Ikaria");
    }

    @Test
    public void testBoatCanMove() {
        assertEquals("Ikaria sails in the water", boat.move(boat.getName()));

    }
}
