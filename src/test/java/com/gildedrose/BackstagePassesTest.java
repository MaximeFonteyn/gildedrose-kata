package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BackstagePassesTest {

    private final String ITEM_NAME = "Backstage passes to a TAFKAL80ETC concert";
    private final int SELLIN = 20;
    private final int QUALITY = 20;

    @Test
    void updateQualityBackstagePassesAfter1DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(21, app.getExtendedItems()[0].getQuality());
        assertEquals(19, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityBackstagePassesAfter5DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< 5;i++) {
            app.updateQuality();
        }
        assertEquals(25, app.getExtendedItems()[0].getQuality());
        assertEquals(15, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityBackstagePassesAtSellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN;i++) {
            app.updateQuality();
        }
        assertEquals(50, app.getExtendedItems()[0].getQuality());
        assertEquals(0, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityBackstagePassesAfter1DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 1;i++) {
            app.updateQuality();
        }
        assertEquals(0, app.getExtendedItems()[0].getQuality());
        assertEquals(-1, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityBackstagePassesAfter5DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 5;i++) {
            app.updateQuality();
        }
        assertEquals(0, app.getExtendedItems()[0].getQuality());
        assertEquals(-5, app.getExtendedItems()[0].getSellIn());
    }

    @Test
    void updateQualityBackstagePassesAfter10DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 10;i++) {
            app.updateQuality();
        }
        assertEquals(0, app.getExtendedItems()[0].getQuality());
        assertEquals(-10, app.getExtendedItems()[0].getSellIn());
    }

}
