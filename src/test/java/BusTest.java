import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;

    @Before
    public void setUp() throws Exception {
        bus = new Bus(2.70, "B12");
    }

    @Test
    public void testBusCanMove() {
        assertEquals("Bus B12 goes through city centre", bus.move(bus.getNumber()));

    }
}
