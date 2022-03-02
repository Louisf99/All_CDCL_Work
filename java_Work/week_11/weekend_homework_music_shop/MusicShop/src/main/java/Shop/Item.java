

package Shop;

import Interfaces.ISell;

public abstract class Item implements ISell {
    private ItemType section;
    private double buyingPrice;
    private double sellingPrice;

    public Item(ItemType section, double buyingPrice, double sellingPrice) {
        this.section = section;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public ItemType getSection(){
        return this.section;
    };
    public double getBuyingPrice(){
        return this.buyingPrice;
    };
    public double getSellingPrice(){
        return this.sellingPrice;
    };
    public double getMarkup(){
        return this.getSellingPrice()-this.getBuyingPrice();
    };
    public void sell(){

    };
}
