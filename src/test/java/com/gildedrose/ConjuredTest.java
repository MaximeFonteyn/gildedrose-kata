package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ConjuredTest {

    private final String ITEM_NAME = "Conjured item";
    private final int SELLIN = 10;
    private final int QUALITY = 40;

    @Test
    void updateQualityConjuredAfter1DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(38, app.getExtendedItems()[0].getQuality());
        assertEquals(9, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityConjuredAfter5DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< 5;i++) {
            app.updateQuality();
        }
        assertEquals(30, app.getExtendedItems()[0].getQuality());
        assertEquals(5, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityConjuredAtSellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN;i++) {
            app.updateQuality();
        }
        assertEquals(20, app.getExtendedItems()[0].getQuality());
        assertEquals(0, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityConjuredAfter1DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 1;i++) {
            app.updateQuality();
        }
        assertEquals(16, app.getExtendedItems()[0].getQuality());
        assertEquals(-1, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityConjuredAfter5DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 5;i++) {
            app.updateQuality();
        }
        assertEquals(0, app.getExtendedItems()[0].getQuality());
        assertEquals(-5, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityConjuredAfter10DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 10;i++) {
            app.updateQuality();
        }
        assertEquals(0, app.getExtendedItems()[0].getQuality());
        assertEquals(-10, app.getExtendedItems()[0].getSellIn());
    }

}
