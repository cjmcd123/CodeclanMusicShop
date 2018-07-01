package ItemTests;

import Items.InstrumentAccessory;
import Items.ItemType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

    InstrumentAccessory accessory;

    @Before
    public void setUp(){
        accessory = new InstrumentAccessory("Fiddle bow", ItemType.ACCESSORY, 5.00, 10.00, "Fiddle", "Fiddlerman");
    }

    @Test
    public void hasName(){
        assertEquals("Fiddle bow", accessory.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Instrument Accessory", accessory.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(5.00, accessory.getBuy_price(), 0.02);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(10.00, accessory.getSell_price(), 0.02);
    }

    @Test
    public void hasInstrument(){
        assertEquals("Fiddle", accessory.getInstrument());
    }

    @Test
    public void hasBrand(){
        assertEquals("Fiddlerman", accessory.getBrand());
    }

    @Test
    public void canSell(){
        assertEquals(5.00, accessory.calculateMarkup(), 0.02);
    }
}
