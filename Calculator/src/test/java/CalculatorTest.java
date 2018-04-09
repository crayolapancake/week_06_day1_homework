import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    private Calculator weeCalculator;

    @Before
    public void before() {
        weeCalculator = new Calculator();
    }

    @Test
    public void add() {
        assertEquals(13, weeCalculator.add(7, 6));
    }


    @Test
    public void subtract() {
        assertEquals(69, weeCalculator.subtract(100, 31));
    }


    @Test
    public void multiply() {
        assertEquals(12, weeCalculator.multiply(3, 4));
    }

    @Test
    public void divide() {
        assertEquals(5, weeCalculator.divide(15, 3));
    }

}


























