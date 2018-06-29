package Instruments;

public class Saxophone extends Instrument {

    private String range;
    private boolean reed;
    private int toneHoles;

    public Saxophone(String name, String material, String colour, InstrumentType type, double buy_price, double sell_price, String noise, String range, boolean reed, int toneHoles) {
        super(name, material, colour, type, buy_price, sell_price, noise);
        this.range = range;
        this.reed = reed;
        this.toneHoles = toneHoles;
    }

    public String getRange() {
        return range;
    }

    public boolean isReed() {
        return reed;
    }

    public int getToneHoles() {
        return toneHoles;
    }
}
