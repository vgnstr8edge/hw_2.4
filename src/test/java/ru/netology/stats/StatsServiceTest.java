package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSum() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSum(values);

        assertEquals(expected, actual);

    }

    @Test
    void calculateMiddleSum() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateMiddleSum(values);

        assertEquals(expected, actual);

    }

    @Test
    void monthWithMaxSum() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.monthWithMaxSum(values);

        assertEquals(expected, actual);

    }


    @Test
    void monthWithMinSum() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.monthWithMinSum(values);

        assertEquals(expected, actual);

    }


    @Test
    void amountUnderMiddle() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.amountUnderMiddle(values);

        assertEquals(expected, actual);

    }

    @Test
    void amountOverMiddle() {
        StatsService service = new StatsService();
        int[] values = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.amountOverMiddle(values);

        assertEquals(expected, actual);

    }


}