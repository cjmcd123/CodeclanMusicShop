package Instruments;

public class Flute extends Instrument{

    private String range;
    private int keys;

    public Flute(String name, String material, String colour, InstrumentType type, double buy_price, double sell_price, String noise, String range, int keys) {
        super(name, material, colour, type, buy_price, sell_price, noise);
        this.range = range;
        this.keys = keys;
    }

    public String getRange() {
        return range;
    }

    public int getKeys() {
        return keys;
    }
}
