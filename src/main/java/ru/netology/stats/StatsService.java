package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }


    public int calculateMiddleSum(int[] values) {
        int middleSum = 0;

        middleSum = calculateSum(values) / values.length;

        return middleSum;
    }


    public int monthWithMaxSum(int[] values) {
        int month = 0;
        int maxMonth = 0;
        int maxSumMonth = values[0];

        for (int value : values) {
            month += 1;
            if (maxSumMonth <= value) {
                maxSumMonth = value;
                maxMonth = month;
            }
        }
        return maxMonth;

    }

    public int monthWithMinSum(int[] values) {
        int month = 0;
        int minMonth = 0;
        int minSumMonth = values[0];

        for (int value : values) {
            month += 1;
            if (minSumMonth >= value) {
                minSumMonth = value;
                minMonth = month;
            }
        }
        return minMonth;

    }


    public int amountUnderMiddle(int[] values) {

        int amount = 0;
        int middleSum = calculateMiddleSum(values);
        for (int value : values) {

            if (middleSum > value) {
                amount += 1;
            }

        }
        return amount;
    }

    public int amountOverMiddle(int[] values) {

        int amount = 0;
        int middleSum = calculateMiddleSum(values);
        for (int value : values) {

            if (middleSum < value) {
                amount += 1;
            }

        }
        return amount;
    }

}






