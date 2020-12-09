package com.gildedrose;

import com.gildedrose.items.ExtendedItem;

import static com.gildedrose.ItemFactory.extendItem;

class GildedRose {
    private ExtendedItem[] extendedItems;

    public GildedRose(Item[] items) {
        this.extendedItems = new ExtendedItem[items.length];
        for (int i = 0; i < items.length; i++) {
            extendedItems[i] = extendItem(items[i]);
        }
    }

    public void updateQuality() {
        for (ExtendedItem extendedItem : extendedItems) {
            extendedItem.updateQuality();
        }
    }

    public ExtendedItem[] getExtendedItems() {
        return extendedItems;
    }

}
