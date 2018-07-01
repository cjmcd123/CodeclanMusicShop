package Items;

import Interfaces.ISell;

public class Item implements ISell {

    private String name;
    private ItemType type;
    private double buy_price;
    private double sell_price;

    public Item(String name, ItemType type, double buy_price, double sell_price) {
        this.name = name;
        this.type = type;
        this.buy_price = buy_price;
        this.sell_price = sell_price;
    }

    public String getName() {
        return name;
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

    public double calculateMarkup() {
        return getSell_price() - getBuy_price();
    }
}
