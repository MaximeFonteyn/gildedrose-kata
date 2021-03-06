package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalItemTest {

    private final String ITEM_NAME = "my test item";
    private final int SELLIN = 10;
    private final int QUALITY = 20;

    @Test
    void updateQualityNormalItemAfter1DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(19, app.getExtendedItems()[0].getQuality());
        assertEquals(9, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityNormalItemAfter5DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< 5;i++) {
            app.updateQuality();
        }
        assertEquals(15, app.getExtendedItems()[0].getQuality());
        assertEquals(5, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityNormalItemAtSellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN;i++) {
            app.updateQuality();
        }
        assertEquals(10, app.getExtendedItems()[0].getQuality());
        assertEquals(0, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityNormalItemAfter1DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 1;i++) {
            app.updateQuality();
        }
        assertEquals(8, app.getExtendedItems()[0].getQuality());
        assertEquals(-1, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityNormalItemAfter5DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 5;i++) {
            app.updateQuality();
        }
        assertEquals(0, app.getExtendedItems()[0].getQuality());
        assertEquals(-5, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityNormalItemAfter10DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 10;i++) {
            app.updateQuality();
        }
        assertEquals(0, app.getExtendedItems()[0].getQuality());
        assertEquals(-10, app.getExtendedItems()[0].getSellIn());
    }

}
