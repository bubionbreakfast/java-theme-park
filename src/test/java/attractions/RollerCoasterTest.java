package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import people.VisitorTest;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor;
    private static final double DELTA = 0.01;


    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitor = new Visitor(25, 201, 50.67);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.4, rollerCoaster.defaultPrice(), DELTA);
    }

    @Test
    public void visitorIsTooTallAndChargedDouble(){
        assertEquals(16.80, rollerCoaster.priceFor(visitor), DELTA);
    }
}
