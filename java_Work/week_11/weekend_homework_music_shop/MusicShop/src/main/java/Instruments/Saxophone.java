package Instruments;

import Shop.*;

import Instruments.*;


public class Saxophone extends InstrumentsAbs {
    public SaxophoneType saxophoneType;

    public Saxophone(ItemType section, InstrumentCategory category, SaxophoneType saxophoneType, double buyingPrice, double sellingPrice) {
        super(section, buyingPrice, sellingPrice, category);
        this.saxophoneType = saxophoneType;
    }

    public SaxophoneType getSaxType() {
        return saxophoneType;
    }

    @Override
    public String play(String text) {
        return "Plays sax sound";
    }
}
