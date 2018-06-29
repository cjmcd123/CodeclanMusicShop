package InstrumentTests;

import Instruments.Bagpipe;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BagpipeTest {

    Bagpipe bagpipe;

    @Before
    public void setUp(){
        bagpipe = new Bagpipe("Bagpipe","Cloth & Wood", "Black Watch Tartan", InstrumentType.WOODWIND, 20.00, 30.00, "Skirl", "Highland", true, 9, 3);
    }

    @Test
    public void hasName(){
        assertEquals("Bagpipe", bagpipe.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Cloth & Wood", bagpipe.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black Watch Tartan", bagpipe.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Woodwind", bagpipe.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(20.00, bagpipe.getBuy_price(), 0.02);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(30.00, bagpipe.getSell_price(), 0.02);
    }

    @Test
    public void hasNoise(){
        assertEquals("Skirl", bagpipe.getNoise());
    }

    @Test
    public void hasStyle(){
        assertEquals("Highland", bagpipe.getStyle());
    }

    @Test
    public void hasReed(){
        assertTrue(bagpipe.isReed());
    }

    @Test
    public void hasFingerHoles(){
        assertEquals(9, bagpipe.getFingerHoles());
    }

    @Test
    public void hasDrones(){
        assertEquals(3, bagpipe.getDrones());
    }

}
