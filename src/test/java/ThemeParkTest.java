import attractions.Dodgems;
import attractions.Park;
import attractions.Playground;
import attractions.RollerCoaster;
import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import org.junit.Before;
import org.junit.Test;
import stalls.CandyflossStall;
import stalls.IceCreamStall;
import stalls.ParkingSpot;
import stalls.TobaccoStall;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    public ThemePark themePark;
    Dodgems dodgems;
    Park park;
    Playground playground;
    RollerCoaster rollerCoaster;
    CandyflossStall candyflossStall;
    IceCreamStall iceCreamStall;
    ParkingSpot parkingSpot;
    TobaccoStall tobaccoStall;
    IReviewed iReviewed;
    ISecurity iSecurity;
    ITicketed iTicketed;

    @Before
    public void before(){

        dodgems = new Dodgems("faster", 8);
        park = new Park("regents", 9);
        playground = new Playground("fun fun", 8);
        candyflossStall = new CandyflossStall("sweety", "bobby", parkingSpot);
        iceCreamStall = new IceCreamStall("mr whippy", "janie", parkingSpot);
//        parkingSpot = new ParkingSpot("")
        tobaccoStall = new TobaccoStall("smokeies", "big tom", parkingSpot);
        themePark = new ThemePark(dodgems,park, playground, rollerCoaster,candyflossStall,iceCreamStall,parkingSpot,tobaccoStall);
    }

    @Test
    public void canGetAllReveiws(){
        assertEquals(19, themePark.getAllReviewed());
    }

}
