package InstrumentTests;


import Instruments.Fiddle;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FiddleTest {

    Fiddle fiddle;

    @Before
    public void setUp(){
        fiddle = new Fiddle("Fiddle","Wood", "Varnished Wood", InstrumentType.STRING, 15.00, 25.00, "Fiddle dee", 4);
    }

    @Test
    public void hasName(){
        assertEquals("Fiddle", fiddle.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", fiddle.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Varnished Wood", fiddle.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("String", fiddle.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(15.00, fiddle.getBuy_price(), 0.02);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(25.00, fiddle.getSell_price(), 0.02);
    }

    @Test
    public void hasNoise(){
        assertEquals("Fiddle dee", fiddle.getNoise());
    }

    @Test
    public void hasStrings(){
        assertEquals(4, fiddle.getStrings());
    }


}
