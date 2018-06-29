package Instruments;

public class Fiddle extends Instrument {

    private int strings;

    public Fiddle(String name, String material, String colour, InstrumentType type, double buy_price, double sell_price, String noise, int strings) {
        super(name, material, colour, type, buy_price, sell_price, noise);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }
}
