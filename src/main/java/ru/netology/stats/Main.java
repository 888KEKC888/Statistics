package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        String[] month = {
                "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"
        };

        int minSales = service.minSales(sales);
        int maxSales = service.maxSales(sales);
        int sumSales = service.sumAllSales(sales);
        int averageAllSales = service.averageAllSales(sales);
        int quantiyyMax = service.quantityMaxSales(sales);
        int quantiyyMin = service.quantityMinSales(sales);
        String minMonth = service.infoMonth(month, minSales);
        String maxMonth = service.infoMonth(month, maxSales);

        System.out.println("Минимальные продажи - Месяц: " + minSales + " - " + minMonth);
        System.out.println("Максимальные продажи - Месяц: " + maxSales + " - " + maxMonth);
        System.out.println("Сумма всех продаж: " + sumSales);
        System.out.println("Средняя сумма всех продаж: " + averageAllSales);
        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + quantiyyMax);
        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + quantiyyMin);

    }
}