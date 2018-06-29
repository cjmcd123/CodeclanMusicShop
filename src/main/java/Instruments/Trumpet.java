package Instruments;

public class Trumpet extends Instrument {

    private String style;
    private int valves;

    public Trumpet(String name, String material, String colour, InstrumentType type, double buy_price, double sell_price, String noise, String style, int valves) {
        super(name, material, colour, type, buy_price, sell_price, noise);
        this.style = style;
        this.valves = valves;
    }

    public String getStyle() {
        return style;
    }

    public int getValves() {
        return valves;
    }
}
