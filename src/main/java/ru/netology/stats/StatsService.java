package ru.netology.stats;

public class StatsService {

    public long minSales(long[] sales) {
        int minSalesInMonth = 0;

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] <= sales[minSalesInMonth]) {
                minSalesInMonth = month;
            }
        }

        return minSalesInMonth + 1;
    }

    public long maxSales(long[] sales) {
        int maxSalesInMonth = 0;

        for (int month = 0; month < sales.length; month++) {
            if (sales[month] >= sales[maxSalesInMonth]) {
                maxSalesInMonth = month;
            }
        }

        return maxSalesInMonth - 1;
    }

    public long sumAllSales(long[] sales) {
        long sumAllSales = 0;

        for (long salesInMonth : sales) {
            sumAllSales += salesInMonth;
        }

        return sumAllSales;
    }

    public long averageAllSales(long[] sales) {
        int month = 12;
        return sumAllSales(sales) / month;

    }

    public long quantityMaxSales(long[] sales) {
        int quantityMaxSales = 0;
        long averageAllSales = averageAllSales(sales);

        for (long salesInMonth : sales) {
            if (salesInMonth >= averageAllSales) {
                quantityMaxSales++;
            }
        }

        return quantityMaxSales;
    }

    public long quantityMinSales(long[] sales) {
        int quantityMinSales = 0;
        long averageAllSales = averageAllSales(sales);

        for (long salesInMonth : sales) {
            if (salesInMonth < averageAllSales) {
                quantityMinSales++;
            }
        }

        return quantityMinSales;
    }


}
