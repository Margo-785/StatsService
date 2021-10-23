package ru.netology.stats;

public class StatsService {

    public long sum(long[] sales) {
        long result = 0;
        for (long sale : sales) {
            result += sale;
        }
        return result;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthWithMax(long[] sales) {
        long max = max(sales);
        int monthCounter = 0;
        int monthWithMax = 0;
        for (long sale : sales) {
            monthCounter++;
            if (sale == max) {
                monthWithMax = monthCounter;
            }
        }
        return monthWithMax;
    }

    public int monthWithMin(long[] sales) {
        long min = min(sales);
        int monthCounter = 1;
        int monthWithMin = 0;
        for (long sale : sales) {
            if (sale == min) {
                monthWithMin = monthCounter;
            }
            monthCounter++;
        }
        return monthWithMin;
    }

    public long max(long[] sales) {
        long max = sales[0];
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min(long[] sales) {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int monthCountMoreThanAverage(long[] sales) {
        long average = average(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale > average) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int monthCountLessThanAverage(long[] sales) {
        long average = average(sales);
        int monthCount = 0;
        for (long sale : sales) {
            if (sale < average) {
                monthCount++;
            }
        }
        return monthCount;
    }
}




