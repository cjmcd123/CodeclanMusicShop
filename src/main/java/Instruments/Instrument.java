package Instruments;

import Interfaces.Iplay;

public abstract class Instrument implements Iplay {

    private String name;
    private String material;
    private String colour;
    private InstrumentType type;
    private double buy_price;
    private double sell_price;
    private String noise;

    public Instrument(String name, String material, String colour, InstrumentType type, double buy_price, double sell_price, String noise) {
        this.name = name;
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
        this.noise = noise;
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public String getType() {
        return type.getType();
    }

    public double getBuy_price() {
        return buy_price;
    }

    public double getSell_price() {
        return sell_price;
    }

    public String getNoise() {
        return noise;
    }

    public String play() {
        return getName() + "makes " + getNoise() + " sounds";
    }
}
