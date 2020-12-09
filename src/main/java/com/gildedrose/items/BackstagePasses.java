package com.gildedrose.items;

import com.gildedrose.Item;

public class BackstagePasses extends ExtendedItem {

    public BackstagePasses(Item item) {
        super(item);
    }

    @Override
    public void updateQuality() {
        if (getSellIn() > 10) {
            computeQuality(1);
        } else if (getSellIn() > 5) {
            computeQuality(2);
        } else if (getSellIn() > 0) {
            computeQuality(3);
        } else {
            setQuality(0);
        }

        computeSellIn(-1);
    }
}
