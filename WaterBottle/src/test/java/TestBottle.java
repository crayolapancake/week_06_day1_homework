import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class TestBottle {
    Bottle bottle;

aa
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
        assertEquals(10, this.volume());
    }

    @Test
    public void emptyBottle(){

    }

    @Test
    public void fillBottle(){
    
    }

}