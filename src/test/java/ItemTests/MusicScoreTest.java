package ItemTests;

import Items.ItemType;
import Items.MusicScore;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MusicScoreTest {

    MusicScore musicScore;

    @Before
    public void setUp(){
        musicScore = new MusicScore("Piano solo", ItemType.MUSICSCORE, 15.00, 30.00, "Mozart", "Piano");
    }

    @Test
    public void hasName(){
        assertEquals("Piano solo", musicScore.getName());
    }

    @Test
    public void hasType(){
        assertEquals("Music Score", musicScore.getType());
    }

    @Test
    public void hasBuyPrice(){
        assertEquals(15.00, musicScore.getBuy_price(), 0.02);
    }

    @Test
    public void hasSellPrice(){
        assertEquals(30.00, musicScore.getSell_price(), 0.02);
    }

    @Test
    public void hasComposer(){
        assertEquals("Mozart", musicScore.getComposer());
    }

    @Test
    public void hasInstrument(){
        assertEquals("Piano", musicScore.getInstrument());
    }

    @Test
    public void canSell(){
        assertEquals(15.00, musicScore.calculateMarkup(), 0.02);
    }
}
