package Instruments;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;
    private String name;


    public Shop(String name){
        this.name = name;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void addStock(ISell item){
        this.stock.add(item);
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void removeStock(ISell item){
        this.stock.remove(item);
    }

    public double totalProfit(){
        double total = 0;
        for (ISell item : this.stock){
            total += item.calculateMarkup();
        }
        return total;
    }
}
