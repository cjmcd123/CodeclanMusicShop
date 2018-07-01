package InstrumentTests;


import Instruments.InstrumentType;
import Instruments.Piano;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PianoTest {

    Piano piano;

    @Before
    public void setUp(){
        piano = new Piano("Piano","Wood", "Black", InstrumentType.KEYBOARD, 50.00, 100.00, "Plink plonk", "Concert", 88, 3);
    }

    @Test
    public void hasName(){
        assertEquals("Piano", piano.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Wood", piano.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Black", piano.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Keyboard", piano.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(50.00, piano.getBuy_price(), 0.02);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(100.00, piano.getSell_price(), 0.02);
    }

    @Test
    public void hasNoise(){
        assertEquals("Plink plonk", piano.getNoise());
    }

    @Test
    public void hasStyle(){
        assertEquals("Concert", piano.getStyle());
    }

    @Test
    public void hasKeys(){
        assertEquals(88, piano.getKeys());
    }

    @Test
    public void hasPedals(){
        assertEquals(3, piano.getPedals());
    }

    @Test
    public void canPlay(){
        assertEquals("Piano's make Plink plonk sounds", piano.play());
    }

    @Test
    public void canSell(){
        assertEquals(50.00, piano.calculateMarkup(), 0.02);
    }
}
