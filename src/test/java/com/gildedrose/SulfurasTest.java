package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasTest {

    private final String ITEM_NAME = "Sulfuras, Hand of Ragnaros";
    private final int SELLIN = 1;
    private final int QUALITY = 80;

    @Test
    void updateQualitySulfurasAfter1DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(QUALITY, app.getExtendedItems()[0].getQuality());
        assertEquals(SELLIN, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualitySulfurasAfter5DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< 5;i++) {
            app.updateQuality();
        }
        assertEquals(QUALITY, app.getExtendedItems()[0].getQuality());
        assertEquals(SELLIN, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualitySulfurasAtSellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN;i++) {
            app.updateQuality();
        }
        assertEquals(QUALITY, app.getExtendedItems()[0].getQuality());
        assertEquals(SELLIN, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualitySulfurasAfter1DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 1;i++) {
            app.updateQuality();
        }
        assertEquals(QUALITY, app.getExtendedItems()[0].getQuality());
        assertEquals(SELLIN, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualitySulfurasAfter5DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 5;i++) {
            app.updateQuality();
        }
        assertEquals(QUALITY, app.getExtendedItems()[0].getQuality());
        assertEquals(SELLIN, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualitySulfurasAfter10DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 10;i++) {
            app.updateQuality();
        }
        assertEquals(QUALITY, app.getExtendedItems()[0].getQuality());
        assertEquals(SELLIN, app.getExtendedItems()[0].getSellIn());
    }

}
