package Extra;

import Shop.*;

public class GuitarString extends Item {
    private String Brand;
    private  int NumOfStrings;

    public GuitarString(ItemType section, String Brand, int NumOfStrings, double buyingPrice, double sellingPrice) {
        super(section, buyingPrice, sellingPrice);
        this.Brand = Brand;
        this.NumOfStrings = NumOfStrings;
    }

    public String getBrand() {
        return Brand;
    }

    public int getNumOfStrings() {
        return NumOfStrings;
    }
}
