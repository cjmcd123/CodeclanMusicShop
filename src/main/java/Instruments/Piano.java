package Instruments;

public class Piano extends Instrument {

    private String style;
    private int keys;
    private int pedals;

    public Piano(String name, String material, String colour, InstrumentType type, double buy_price, double sell_price, String noise, String style, int keys, int pedals) {
        super(name, material, colour, type, buy_price, sell_price, noise);
        this.style = style;
        this.keys = keys;
        this.pedals = pedals;
    }

    public String getStyle() {
        return style;
    }

    public int getKeys() {
        return keys;
    }

    public int getPedals() {
        return pedals;
    }
}
