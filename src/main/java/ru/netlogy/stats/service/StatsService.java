package ru.netlogy.stats.service;
public class StatsService {


    public int getSumSales(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public double getAvgSales(int[] sales) {
        double avg = 0;
        for (int i : sales) {
            avg = avg + i;
        }
        return avg / sales.length;
    }

    public int getNumMaxMonth(int[] sales) {
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;

    }

    public int getNumMinMonth(int[] sales) {
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public double getAboveAvarage(int[] sales) {
        double avg = getAvgSales(sales);
        double aboveAvarage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > avg) {
                aboveAvarage++;
            }
        }
        return aboveAvarage;
    }

    public double getBelowAvarage(int[] sales) {
        double avg = getAvgSales(sales);
        double belowAvarage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < avg) {
                belowAvarage++;
            }
        }
        return belowAvarage;

    }
}





