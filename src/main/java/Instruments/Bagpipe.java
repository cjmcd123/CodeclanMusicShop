package Instruments;

public class Bagpipe extends Instrument{

    private String style;
    private boolean reed;
    private int fingerHoles;
    private int drones;

    public Bagpipe(String name, String material, String colour, InstrumentType type, double buy_price, double sell_price, String noise, String style, boolean reed, int fingerHoles, int drones) {
        super(name, material, colour, type, buy_price, sell_price, noise);
        this.style = style;
        this.reed = reed;
        this.fingerHoles = fingerHoles;
        this.drones = drones;
    }

    public String getStyle() {
        return style;
    }

    public boolean isReed() {
        return reed;
    }

    public int getFingerHoles() {
        return fingerHoles;
    }

    public int getDrones() {
        return drones;
    }
}
