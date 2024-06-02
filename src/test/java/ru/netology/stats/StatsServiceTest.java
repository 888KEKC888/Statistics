package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void testSumAllSalesNotMinus() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long sumSales = service.sumAllSales(sales);
        System.out.println("Сумма всех продаж: " + sumSales);

        boolean notMinus = sumSales >= 0;

        Assertions.assertTrue(notMinus);

    }

    @Test

    public void testAverageAllSalesNotMinus() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long averageAllSales = service.averageAllSales(sales);
        System.out.println("Средняя сумма всех продаж: " + averageAllSales);

        boolean notMinus = averageAllSales >= 0;

        Assertions.assertTrue(notMinus);

    }

    @Test

    public void testMaxSalesNotMinus() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long maxSales = service.maxSales(sales);
        System.out.println("Максимальные продажи - Месяц: " + maxSales);

        boolean notMinus = maxSales >= 0;

        Assertions.assertTrue(notMinus);

    }

    @Test

    public void testMinSalesNotMinus() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long minSales = service.minSales(sales);
        System.out.println("Минимальные продажи - Месяц: " + minSales);

        boolean notMinus = minSales >= 0;

        Assertions.assertTrue(notMinus);

    }

    @Test

    public void testQuantityMinSalesNotMinus() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long quantityMin = service.quantityMinSales(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + quantityMin);

        boolean notMinus = quantityMin >= 0;

        Assertions.assertTrue(notMinus);

    }

    @Test

    public void testQuantityMaxSalesNotMinus() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long quantityMax = service.quantityMaxSales(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + quantityMax);

        boolean notMinus = quantityMax >= 0;

        Assertions.assertTrue(notMinus);

    }


}
