package InstrumentTests;

import Instruments.Flute;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FluteTest {

    Flute flute;

    @Before
    public void setUp(){
        flute = new Flute("Flute","Silver plated brass", "Silver", InstrumentType.WOODWIND, 30.00, 50.00, "Toot toot", "Alto", 16);
    }

    @Test
    public void hasName(){
        assertEquals("Flute", flute.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Silver plated brass", flute.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Silver", flute.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Woodwind", flute.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(30.00, flute.getBuy_price(), 0.02);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(50.00, flute.getSell_price(), 0.02);
    }

    @Test
    public void hasNoise(){
        assertEquals("Toot toot", flute.getNoise());
    }

    @Test
    public void hasRange(){
        assertEquals("Alto", flute.getRange());
    }

    @Test
    public void hasKeys(){
        assertEquals(16, flute.getKeys());
    }

}
