package Instruments;

public class Drum extends Instrument {

    private String style;
    private boolean snared;

    public Drum(String name, String material, String colour, InstrumentType type, double buy_price, double sell_price, String noise, String style, boolean snared) {
        super(name, material, colour, type, buy_price, sell_price, noise);
        this.style = style;
        this.snared = snared;
    }

    public String getStyle() {
        return style;
    }

    public boolean isSnared() {
        return snared;
    }
}
