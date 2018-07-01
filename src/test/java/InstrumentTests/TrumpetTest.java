package InstrumentTests;

import Instruments.Trumpet;
import Instruments.InstrumentType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TrumpetTest {

    Trumpet trumpet;

    @Before
    public void setUp(){
        trumpet = new Trumpet("Trumpet","Brass", "Gold", InstrumentType.BRASS, 20.00, 40.00, "Toom", "Bass", 4);
    }

    @Test
    public void hasName(){
        assertEquals("Trumpet", trumpet.getName());
    }

    @Test
    public void hasMaterial(){
        assertEquals("Brass", trumpet.getMaterial());
    }

    @Test
    public void hasColour(){
        assertEquals("Gold", trumpet.getColour());
    }

    @Test
    public void hasType(){
        assertEquals("Brass", trumpet.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(20.00, trumpet.getBuy_price(), 0.02);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(40.00, trumpet.getSell_price(), 0.02);
    }

    @Test
    public void hasNoise(){
        assertEquals("Toom", trumpet.getNoise());
    }

    @Test
    public void hasStyle(){
        assertEquals("Bass", trumpet.getStyle());
    }

    @Test
    public void hasValves(){
        assertEquals(4, trumpet.getValves());
    }

    @Test
    public void canPlay(){
        assertEquals("Trumpet's make Toom sounds", trumpet.play());
    }

    @Test
    public void canSell(){
        assertEquals(20.00, trumpet.calculateMarkup(), 0.02);
    }
}
