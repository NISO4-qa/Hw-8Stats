package ru.netlogy.stats.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void CountGetSumSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.getSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CountAvarageSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.getAvgSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FindMaxMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.getNumMaxMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FindMinMonthSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.getNumMinMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FindSalesAboveAvarage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        double actual = service.getAboveAvarage(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void FindSalesBelowAvarage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        double actual = service.getBelowAvarage(sales);
        Assertions.assertEquals(expected, actual);

    }
}