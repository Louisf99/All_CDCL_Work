package Shop;

import Interfaces.*;
import Extra.*;
import Instruments.*;
import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell> stock = new ArrayList<>();
    private double potentialProfit;

    public Shop(String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void addItem(ISell item){
        this.stock.add(item);
    }

    public void removeItem(ISell item) {
        this.stock.remove(item);
    }

    public double calcPotentialProfit() {
        potentialProfit = 0;
        for (ISell i: stock){
            potentialProfit += i.getMarkup();
        }
        return potentialProfit;
    }
}
