package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void CalculateSum() {
        StatsService service = new StatsService();
        int expected = 180;
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.calculateSum(purchases);

        assertEquals(expected, sum);
    }

    @Test
    void avgSellInMonth() {
        StatsService service = new StatsService();
        int expected = 15;
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSum = service.calculateAverageSum(purchases);
        assertEquals(expected, averageSum);

    }

    @Test
    void MonthMaxSum() {
        StatsService service = new StatsService();
        int expected = 8;
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int currentMax = service.MonthMaxSum(purchases);
        assertEquals(expected, currentMax);

    }

    @Test
    void MonthMinSum() {
        StatsService service = new StatsService();
        int expected = 9;
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int currentMin = service.MonthMinSum(purchases);
        assertEquals(expected, currentMin);

    }

    @Test
    void countMonthUnderAvg() {
        StatsService service = new StatsService();
        int expected = 5;
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthUnder = service.countMonthUnderAvg(purchases);
        assertEquals(expected, monthUnder);

    }

    @Test
    void countMonthOverAvg() {
        StatsService service = new StatsService();
        int expected = 5;
        int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int monthOver = service.countMonthOverAvg(purchases);
        assertEquals(expected, monthOver);

    }
}