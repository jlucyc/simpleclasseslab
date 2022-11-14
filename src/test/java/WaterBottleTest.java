import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle cup;
    @Before
    public void before(){
        cup = new WaterBottle(100);

    }

    @Test
    public void hasVolume(){
        assertEquals(100, cup.getVolume());
    }
    @Test
    public void checkDrinkSubtract10(){
        cup.drink();
        assertEquals(90, cup.getVolume());
    }
    @Test
    public void checkDrinkIsDone(){
        cup.empty();
        assertEquals(0, cup.getVolume());
    }

    @Test
    public void checkDrinkIsFull(){
        cup.fill();
        assertEquals(100, cup.getVolume());
    }
}
