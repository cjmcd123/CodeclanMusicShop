package Items;

public class MusicScore extends Item {

    private String composer;
    private String instrument;

    public MusicScore(String name, ItemType type, double buy_price, double sell_price, String composer, String instrument) {
        super(name, type, buy_price, sell_price);
        this.composer = composer;
        this.instrument = instrument;
    }

    public String getComposer() {
        return composer;
    }

    public String getInstrument() {
        return instrument;
    }
}
