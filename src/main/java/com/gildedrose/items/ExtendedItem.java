package com.gildedrose.items;

import com.gildedrose.Item;

public abstract class ExtendedItem {

    private static final int LOWEST_QUALITY = 0;
    private static final int HIGHEST_QUALITY = 50;

    private final Item item;

    public ExtendedItem(Item item) {
        this.item = item;
    }

    abstract public void updateQuality();

    public void computeQuality(int valueToCompute) {
        item.quality += valueToCompute;
        if (item.quality > HIGHEST_QUALITY) {
            item.quality = HIGHEST_QUALITY;
        }
        if (item.quality < LOWEST_QUALITY) {
            item.quality = LOWEST_QUALITY;
        }
    }

    public void computeSellIn(int valueToCompute) {
        item.sellIn += valueToCompute;
    }

    public int getSellIn() {
        return item.sellIn;
    }

    public int getQuality() {
        return item.quality;
    }

    public void setQuality(int quality) {
        item.quality = quality;
    }

}
