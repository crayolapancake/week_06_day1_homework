import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestBottle {

   private Bottle bottle;

    @Before
    public void before() {
        bottle = new Bottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, bottle.getVolume() );
    }

    @Test
    public void takeDrink(){
        Bottle.takeDrink;
        assertEquals(90, bottle.getVolume());
    }

    @Test
    public void emptyBottle(){
        Bottle.emptyBottle();
        assertEquals(0, bottle.getVolume());
    }

    @Test
    public void fillBottle(){
        Bottle.fillBottle();
        assertEquals(100, bottle.getVolume());

    }

}
