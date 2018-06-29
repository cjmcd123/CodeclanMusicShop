package InstrumentTests;

import Instruments.Saxophone;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void setUp(){
        saxophone = new Saxophone("Saxophone","Brass", "Gold", InstrumentType.BRASS, 30.00, 60.00, "Berrrt", "Baritone", true, 23);
    }

    @Test
    public void hasName(){
        assertEquals("Saxophone", saxophone.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", saxophone.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Gold", saxophone.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Brass", saxophone.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(30.00, saxophone.getBuy_price(), 0.02);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(60.00, saxophone.getSell_price(), 0.02);
    }

    @Test
    public void hasNoise(){
        assertEquals("Berrrt", saxophone.getNoise());
    }

    @Test
    public void hasRange(){
        assertEquals("Baritone", saxophone.getRange());
    }

    @Test
    public void hasReed(){
        assertTrue(saxophone.isReed());
    }

    @Test
    public void hasToneHoles(){
        assertEquals(23, saxophone.getToneHoles());
    }


}
