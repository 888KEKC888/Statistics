package ru.netology.stats;

public class StatsService {

    public long minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth - 1;
    }

    public long sumAllSales(long[] sales) {
        long sumSales = 0;

        for (long i : sales) {
            sumSales += i;
        }

        return sumSales;
    }

    public long averageAllSales(long[] sales) {
        long sumSales = 0;


        for (long i : sales) {
            sumSales += i;
        }

        return sumSales / 12;
    }

    public long quantityMaxSales(long[] sales) {
        int quaMaxSales = 0;
        long allSales = averageAllSales(sales);

        for (long i : sales) {
            if (i >= allSales) {
                quaMaxSales++;
            }
        }

        return quaMaxSales;
    }

    public long quantityMinSales(long[] sales) {
        int quaMinSales = 0;
        long allSales = averageAllSales(sales);

        for (long i : sales) {
            if (i < allSales) {
                quaMinSales++;
            }
        }

        return quaMinSales;
    }


}
