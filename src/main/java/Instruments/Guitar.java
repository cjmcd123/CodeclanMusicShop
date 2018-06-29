package Instruments;

public class Guitar extends Instrument {

    private boolean electric;
    private int strings;

    public Guitar(String name, String material, String colour, InstrumentType type, double buy_price, double sell_price, String noise, boolean electric, int strings) {
        super(name, material, colour, type, buy_price, sell_price, noise);
        this.electric = electric;
        this.strings = strings;
    }

    public boolean isElectric() {
        return electric;
    }

    public int getStrings() {
        return strings;
    }
}
