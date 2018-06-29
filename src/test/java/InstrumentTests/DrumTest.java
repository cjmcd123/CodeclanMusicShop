package InstrumentTests;

import Instruments.Drum;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DrumTest {

    Drum drum;

    @Before
    public void setUp(){
        drum = new Drum("Snare Drum","Wood", "Black", InstrumentType.PERCUSSION, 10.00, 15.00, "Rat-a-tat-ta", "Snare", true);
    }

    @Test
    public void hasName(){
        assertEquals("Snare Drum", drum.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", drum.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", drum.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Percussion", drum.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(10.00, drum.getBuy_price(), 0.02);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(15.00, drum.getSell_price(), 0.02);
    }

    @Test
    public void hasNoise(){
        assertEquals("Rat-a-tat-ta", drum.getNoise());
    }

    @Test
    public void hasStyle(){
        assertEquals("Snare", drum.getStyle());
    }

    @Test
    public void hasSnared(){
        assertTrue(drum.isSnared());
    }

}
