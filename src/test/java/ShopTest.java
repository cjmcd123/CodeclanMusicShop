import Instruments.*;
import Items.InstrumentAccessory;
import Items.ItemType;
import Items.MusicScore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;

    @Before
    public void setUp(){
        shop = new Shop("Codeclan Music Shop");
    }

    @Test
    public void hasName(){
        assertEquals("Codeclan Music Shop", shop.getName());
    }

    @Test
    public void canAddStock(){
       Bagpipe bagpipe = new Bagpipe("Bagpipe","Cloth & Wood", "Black Watch Tartan", InstrumentType.WOODWIND, 20.00, 30.00, "Skirl", "Highland", true, 9, 3);
       shop.addStock(bagpipe);
       assertEquals(1, shop.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        Bagpipe bagpipe = new Bagpipe("Bagpipe","Cloth & Wood", "Black Watch Tartan", InstrumentType.WOODWIND, 20.00, 30.00, "Skirl", "Highland", true, 9, 3);
        shop.addStock(bagpipe);
        shop.removeStock(bagpipe);
        assertEquals(0, shop.getStock().size());
    }

    @Test
    public void getTotalProfit(){
        Bagpipe bagpipe = new Bagpipe("Bagpipe","Cloth & Wood", "Black Watch Tartan", InstrumentType.WOODWIND, 20.00, 30.00, "Skirl", "Highland", true, 9, 3);
        shop.addStock(bagpipe);
        Drum drum = new Drum("Snare Drum","Wood", "Black", InstrumentType.PERCUSSION, 10.00, 15.00, "Rat-a-tat-ta", "Snare", true);
        shop.addStock(drum);
        Fiddle fiddle = new Fiddle("Fiddle","Wood", "Varnished Wood", InstrumentType.STRING, 15.00, 25.00, "Fiddle dee", 4);
        shop.addStock(fiddle);
        Flute flute = new Flute("Flute","Silver plated brass", "Silver", InstrumentType.WOODWIND, 30.00, 50.00, "Toot toot", "Alto", 16);
        shop.addStock(flute);
        Guitar guitar = new Guitar("Guitar","Wood", "Light Wood", InstrumentType.STRING, 20.00, 30.00, "Twang",false, 4);
        shop.addStock(guitar);
        Piano piano = new Piano("Piano","Wood", "Black", InstrumentType.KEYBOARD, 50.00, 100.00, "Plink plonk", "Concert", 88, 3);
        shop.addStock(piano);
        Saxophone saxophone = new Saxophone("Saxophone","Brass", "Gold", InstrumentType.BRASS, 30.00, 60.00, "Berrrt", "Baritone", true, 23);
        shop.addStock(saxophone);
        Trumpet trumpet = new Trumpet("Trumpet","Brass", "Gold", InstrumentType.BRASS, 20.00, 40.00, "Toom", "Bass", 4);
        shop.addStock(trumpet);
        InstrumentAccessory accessory = new InstrumentAccessory("Fiddle bow", ItemType.ACCESSORY, 5.00, 10.00, "Fiddle", "Fiddlerman");
        shop.addStock(accessory);
        MusicScore musicScore = new MusicScore("Piano solo", ItemType.MUSICSCORE, 15.00, 30.00, "Mozart", "Piano");
        shop.addStock(musicScore);
        assertEquals(175.00, shop.totalProfit(), 0.02);
    }
}

