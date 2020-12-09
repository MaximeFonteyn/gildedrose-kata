package com.gildedrose;

import com.gildedrose.items.*;

public class ItemFactory {

    public final static String AGED_BRIE = "Aged Brie";
    public final static String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public final static String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public final static String CONJURED = "Conjured";

    public static ExtendedItem extendItem(Item item) {
        if (item == null || item.name == null) {
            return null;
        }
        if (item.name.toLowerCase().contains(CONJURED.toLowerCase())) {
            return new Conjured(item);
        }
        switch (item.name) {
            case AGED_BRIE:
                return new AgedBrie(item);
            case BACKSTAGE_PASSES:
                return new BackstagePasses(item);
            case SULFURAS:
                return new Sulfuras(item);
            default:
                return new BasicItem(item);
        }
    }
}

