// Jasmine Jones - CS2102 BL01
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Examples {
// BoatTour.java
    // tripCosts
    @Test
    public void testLonelyVoyage(){
        BoatTour lonely = new BoatTour();
        assertEquals(1500, lonely.tripCosts(0, 0));
    }
    @Test
    public void testTripCostsBigFamily(){
        BoatTour bigFamily = new BoatTour();
        assertEquals(1549, bigFamily.tripCosts(2, 7));
    }
    @Test
    public void testTripCostsNoKids(){
        BoatTour noKids = new BoatTour();
        assertEquals(1605, noKids.tripCosts(15, 0));
    }

    // tripGross
    @Test
    public void testNoSalesToday(){
        BoatTour noSales = new BoatTour();
        assertEquals(0, noSales.tripGross(0, 0));
    }
    @Test
    public void testNoAdults(){
        BoatTour noAdults = new BoatTour();
        assertEquals(1800, noAdults.tripGross(0, 40));
    }
    @Test
    public void testAverageFamily(){
        BoatTour family = new BoatTour();
        assertEquals(210, family.tripGross(2, 2));
    }

    // netProfit
    @Test
    public void testPackedBoat(){
    BoatTour boat = new BoatTour();
    assertEquals("trip profit: $360", boat.netProfit(20,20));
    }
    @Test
    public void testMajorLosses(){
        BoatTour bust =  new BoatTour();
        assertEquals("trip profit: -$1407", bust.netProfit(1,1));
    }

// HouseCalculator
    // totalCost
    @Test
    public void testFreeHouse(){
        HouseCalculator free =  new HouseCalculator();
        assertEquals(2500.0, free.totalCost(0.0, 0.0), 0.1);
    }

    @Test
    public void testMediumHouse(){
        HouseCalculator medium =  new HouseCalculator();
        assertEquals(1230500.0, medium.totalCost(400000, 55000), 0.1);
    }
}
