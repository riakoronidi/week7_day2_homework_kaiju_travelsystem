import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;
    Traveller traveller;

    @Before
    public void setUp() throws Exception {
        plane = new Plane(80.96, "easyjet", 19.04);
        traveller = new Traveller("Ria", 100.00);
    }

    @Test
    public void testPlaneCanMove() {
        assertEquals("Airline easyjet flies in the air", plane.move(plane.getAirline()));
    }

    @Test
    public void testCanReturnJourneyTicket() {
        assertEquals(100, plane.getTicketSum(), 0.01);
    }

    @Test
    public void testTravellersCashRefund() {
        assertEquals(0, plane.returnCashRefund(), 0.01);
    }
}
