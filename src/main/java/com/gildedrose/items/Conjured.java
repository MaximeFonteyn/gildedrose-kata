package com.gildedrose.items;

import com.gildedrose.Item;

public class Conjured extends ExtendedItem {

    public Conjured(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (getSellIn() > 0) {
            computeQuality(-2);
        } else {
            computeQuality(-4);
        }
        computeSellIn(-1);
    }
}
