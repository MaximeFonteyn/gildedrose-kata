package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SulfurasTest {

    private final String ITEM_NAME = "Sulfuras, Hand of Ragnaros";
    private final int SELLIN = 1;
    private final int QUALITY = 80;

    @Test
    void updateQualityAgedBrieAfter1DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(QUALITY, app.items[0].quality);
        assertEquals(SELLIN, app.items[0].sellIn);
    }

    @Test
    void updateQualityAgedBrieAfter5DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< 5;i++) {
            app.updateQuality();
        }
        assertEquals(QUALITY, app.items[0].quality);
        assertEquals(SELLIN, app.items[0].sellIn);
    }

    @Test
    void updateQualityAgedBrieAtSellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN;i++) {
            app.updateQuality();
        }
        assertEquals(QUALITY, app.items[0].quality);
        assertEquals(SELLIN, app.items[0].sellIn);
    }

    @Test
    void updateQualityAgedBrieAfter1DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 1;i++) {
            app.updateQuality();
        }
        assertEquals(QUALITY, app.items[0].quality);
        assertEquals(SELLIN, app.items[0].sellIn);
    }

    @Test
    void updateQualityAgedBrieAfter5DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 5;i++) {
            app.updateQuality();
        }
        assertEquals(QUALITY, app.items[0].quality);
        assertEquals(SELLIN, app.items[0].sellIn);
    }

    @Test
    void updateQualityAgedBrieAfter10DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 10;i++) {
            app.updateQuality();
        }
        assertEquals(QUALITY, app.items[0].quality);
        assertEquals(SELLIN, app.items[0].sellIn);
    }

}
