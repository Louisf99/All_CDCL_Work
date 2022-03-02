package Instruments;
import Shop.*;
public class Guitar extends InstrumentsAbs{
    private GuitarType guitarType;
    private int strings;

    public Guitar(ItemType section, InstrumentCategory category, GuitarType guitarType, int strings, double buyingPrice, double sellingPrice) {
        super(section, buyingPrice, sellingPrice, category);
        this.guitarType = guitarType;
        this.strings = strings;
    }

    public Instruments.GuitarType getGuitarType() {
        return guitarType;
    }

    public int getStrings() {
        return strings;
    }

    @Override
    public String play(String text) {
        return "Plays guitar sound";
    }
}
