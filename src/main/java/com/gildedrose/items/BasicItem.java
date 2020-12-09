package com.gildedrose.items;

import com.gildedrose.Item;

public class BasicItem extends ExtendedItem {

    public BasicItem(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (getSellIn() > 0) {
            computeQuality(-1);
        } else {
            computeQuality(-2);
        }
        computeSellIn(-1);
    }
}
