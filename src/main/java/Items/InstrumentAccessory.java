package Items;

public class InstrumentAccessory extends Item{

    private String instrument;
    private String brand;

    public InstrumentAccessory(String name, ItemType type, double buy_price, double sell_price, String instrument, String brand) {
        super(name, type, buy_price, sell_price);
        this.instrument = instrument;
        this.brand = brand;
    }

    public String getInstrument() {
        return instrument;
    }

    public String getBrand() {
        return brand;
    }
}
