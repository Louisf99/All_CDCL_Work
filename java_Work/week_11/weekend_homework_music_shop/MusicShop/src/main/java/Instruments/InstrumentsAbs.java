package Instruments;

import Interfaces.IPlay;
import Shop.Item;
import Shop.ItemType;

public abstract class InstrumentsAbs extends Item implements  IPlay {


    private InstrumentCategory type;

    public InstrumentsAbs(ItemType section, double buyingPrice, double sellingPrice, InstrumentCategory category) {
        super(section, buyingPrice, sellingPrice);
        this.type = category;
    }

    public InstrumentCategory getType() {
        return type;
    }

    public InstrumentCategory getCategory() {
        return this.type;
    }

    @Override
    public String play(String text) {
        return "Instrument playing sound";
    }


}

