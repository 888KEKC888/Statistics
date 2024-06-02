package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };

        long minSales = service.minSales(sales);
        long maxSales = service.maxSales(sales);
        long sumSales = service.sumAllSales(sales);
        long averageAllSales = service.averageAllSales(sales);
        long quantityMax = service.quantityMaxSales(sales);
        long quantityMin = service.quantityMinSales(sales);

        System.out.println("Минимальные продажи - Месяц: " + minSales);
        System.out.println("Максимальные продажи - Месяц: " + maxSales);
        System.out.println("Сумма всех продаж: " + sumSales);
        System.out.println("Средняя сумма всех продаж: " + averageAllSales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + quantityMax);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + quantityMin);

    }
}