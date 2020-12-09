package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AgedBrieTest {

    private final String ITEM_NAME = "Aged Brie";
    private final int SELLIN = 10;
    private final int QUALITY = 20;

    @Test
    void updateQualityAgedBrieAfter1DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(21, app.items[0].quality);
        assertEquals(9, app.items[0].sellIn);
    }

    @Test
    void updateQualityAgedBrieAfter5DayTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< 5;i++) {
            app.updateQuality();
        }
        assertEquals(25, app.items[0].quality);
        assertEquals(5, app.items[0].sellIn);
    }

    @Test
    void updateQualityAgedBrieAtSellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN;i++) {
            app.updateQuality();
        }
        assertEquals(30, app.items[0].quality);
        assertEquals(0, app.items[0].sellIn);
    }

    @Test
    void updateQualityAgedBrieAfter1DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 1;i++) {
            app.updateQuality();
        }
        assertEquals(32, app.items[0].quality);
        assertEquals(-1, app.items[0].sellIn);
    }

    @Test
    void updateQualityAgedBrieAfter5DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 5;i++) {
            app.updateQuality();
        }
        assertEquals(40, app.items[0].quality);
        assertEquals(-5, app.items[0].sellIn);
    }

    @Test
    void updateQualityAgedBrieAfter10DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 10;i++) {
            app.updateQuality();
        }
        assertEquals(50, app.items[0].quality);
        assertEquals(-10, app.items[0].sellIn);
    }

    @Test
    void updateQualityAgedBrieAfter20DaySellTimeTest() {
        Item[] items = new Item[] { new Item(ITEM_NAME, SELLIN, QUALITY) };
        GildedRose app = new GildedRose(items);
        for(int i=0;i< SELLIN + 20;i++) {
            app.updateQuality();
        }
        assertEquals(50, app.items[0].quality);
        assertEquals(-20, app.items[0].sellIn);
    }
}
