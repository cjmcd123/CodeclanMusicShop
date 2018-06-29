package InstrumentTests;

import Instruments.Guitar;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GuitarTest {

    Guitar guitar;

    @Before
    public void setUp(){
        guitar = new Guitar("Guitar","Wood", "Light Wood", InstrumentType.STRING, 20.00, 30.00, "Twang",false, 4);
    }

    @Test
    public void hasName(){
        assertEquals("Guitar", guitar.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", guitar.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Light Wood", guitar.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("String", guitar.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(20.00, guitar.getBuy_price(), 0.02);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(30.00, guitar.getSell_price(), 0.02);
    }

    @Test
    public void hasNoise(){
        assertEquals("Twang", guitar.getNoise());
    }

    @Test
    public void isElectric(){
        assertFalse(guitar.isElectric());
    }

    @Test
    public void hasStrings(){
        assertEquals(4, guitar.getStrings());
    }


}
