package ru.netology.stats;

public class StatsService {

    public String infoMonth(String[] month, int sales) {
        String wordMonth = null;

        for (int i = 0; i < sales; i++) {
            if (sales == 1) {

                wordMonth = month[i];
            } else {

                wordMonth = month[i];
            }
        }
        return wordMonth;
    }


    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth - 1;
    }

    public int sumAllSales(int[] sales) {
        int sumSales = 0;

        for (int i : sales) {
            sumSales += i;
        }

        return sumSales;
    }

    public int averageAllSales(int[] sales) {
        int sumSales = 0;


        for (int i : sales) {
            sumSales += i;
        }

        return sumSales / 12;
    }

    public int quantityMaxSales(int[] sales) {
        int quaMaxSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= averageAllSales(sales)) quaMaxSales++;
        }

        return quaMaxSales;
    }

    public int quantityMinSales(int[] sales) {
        int quaMinSales = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageAllSales(sales)) quaMinSales++;
        }

        return quaMinSales;
    }


}
