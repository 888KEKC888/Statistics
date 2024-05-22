package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void testSumAllSallesNotNegativ() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long sumSales = service.sumAllSales(sales);
        System.out.println("Сумма всех продаж: " + sumSales);

        boolean notNegativ = sumSales >= 0;

        Assertions.assertTrue(notNegativ);

    }

    @Test

    public void testAverageAllSalesNotNegativ() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long averageAllSales = service.averageAllSales(sales);
        System.out.println("Средняя сумма всех продаж: " + averageAllSales);

        boolean notNegativ = averageAllSales >= 0;

        Assertions.assertTrue(notNegativ);

    }

    @Test

    public void testMaxSalesNotNegativ() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long maxSales = service.maxSales(sales);
        System.out.println("Максимальные продажи - Месяц: " + maxSales);

        boolean notNegativ = maxSales >= 0;

        Assertions.assertTrue(notNegativ);

    }

    @Test

    public void testMinSalesNotNegativ() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long minSales = service.minSales(sales);
        System.out.println("Минимальные продажи - Месяц: " + minSales);

        boolean notNegativ = minSales >= 0;

        Assertions.assertTrue(notNegativ);

    }

    @Test

    public void testQuantiyyMinSalesNotNegativ() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long quantiyyMin = service.quantityMinSales(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + quantiyyMin);

        boolean notNegativ = quantiyyMin >= 0;

        Assertions.assertTrue(notNegativ);

    }

    @Test

    public void testQuantiyyMaxSalesNotNegativ() {

        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        long quantiyyMax = service.quantityMaxSales(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + quantiyyMax);

        boolean notNegativ = quantiyyMax >= 0;

        Assertions.assertTrue(notNegativ);

    }


}
