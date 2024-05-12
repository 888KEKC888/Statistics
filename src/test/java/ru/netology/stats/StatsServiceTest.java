package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {


    @Test

    public void testSumAllSallesNotNegativ() {

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        int sumSales = service.sumAllSales(sales);
        System.out.println("Сумма всех продаж: " + sumSales);

        boolean NotNegativ = false;

        if (sumSales >= 0) {
            NotNegativ = true;
        }
        Assertions.assertEquals(NotNegativ, true);


    }

    @Test

    public void testAverageAllSalesNotNegativ() {

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        int averageAllSales = service.averageAllSales(sales);
        System.out.println("Средняя сумма всех продаж: " + averageAllSales);

        boolean NotNegativ = false;

        if (averageAllSales >= 0) {
            NotNegativ = true;
        }
        Assertions.assertEquals(NotNegativ, true);


    }

    @Test

    public void testMaxSalesNotNegativ() {

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        String[] month = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };
        StatsService service = new StatsService();
        int maxSales = service.maxSales(sales);
        String maxMonth = service.infoMonth(month, maxSales);
        System.out.println("Максимальные продажи - Месяц: " + maxSales + " - " + maxMonth);

        boolean NotNegativ = false;

        if (maxSales >= 0) {
            NotNegativ = true;
        }
        Assertions.assertEquals(NotNegativ, true);


    }

    @Test

    public void testMinSalesNotNegativ() {

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        String[] month = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };
        StatsService service = new StatsService();
        int minSales = service.minSales(sales);
        String minMonth = service.infoMonth(month, minSales);
        System.out.println("Минимальные продажи - Месяц: " + minSales + " - " + minMonth);

        boolean NotNegativ = false;

        if (minSales >= 0) {
            NotNegativ = true;
        }
        Assertions.assertEquals(NotNegativ, true);


    }

    @Test

    public void testQuantiyyMinSalesNotNegativ() {

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        int quantiyyMin = service.quantityMinSales(sales);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + quantiyyMin);

        boolean NotNegativ = false;

        if (quantiyyMin >= 0) {
            NotNegativ = true;
        }
        Assertions.assertEquals(NotNegativ, true);


    }

    @Test

    public void testQuantiyyMaxSalesNotNegativ() {

        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        int quantiyyMax = service.quantityMaxSales(sales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + quantiyyMax);

        boolean NotNegativ = false;

        if (quantiyyMax >= 0) {
            NotNegativ = true;
        }
        Assertions.assertEquals(NotNegativ, true);


    }


}
