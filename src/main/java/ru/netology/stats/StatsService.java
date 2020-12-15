package ru.netology.stats;

public class StatsService {
    public int calculateSum(int[] purchases) {
        int sum = 0;

        for (int purchase : purchases) {
            sum += purchase;
        }
        return sum;
    }


    public int calculateAverageSum(int[] purchases) {
        int averageSum = calculateSum(purchases) / purchases.length;

        return averageSum;
    }

    public int MonthMaxSum(int[] purchases) {
        int currentMax = purchases[0];
        int month = 0;
        int maxMonth = 0;

        for (int purchase : purchases) {

            month += 1;
            if (currentMax <= purchase) {
                currentMax = purchase;
                maxMonth = month;

            }
        }

        return maxMonth;
    }

    public int MonthMinSum(int[] purchases) {
        int currentMin = purchases[0];
        int month = 0;
        int minMonth = 0;

        for (int purchase : purchases) {

            month += 1;
            if (currentMin >= purchase) {
                currentMin = purchase;
                minMonth = month;

            }
        }

        return minMonth;
    }

    public int countMonthUnderAvg(int[] purchases) {
        int monthUnder = 0;
        int averageSum = calculateSum(purchases) / purchases.length;

        for (int purchase : purchases) {
            if (purchase < averageSum ) {
                monthUnder += 1;
            }
        }
        return monthUnder;
    }

    public int countMonthOverAvg(int[] purchases) {
        int monthOver = 0;
        int averageSum = calculateSum(purchases) / purchases.length;

        for (int purchase : purchases) {
            if (purchase > averageSum ) {
                monthOver += 1;
            }
        }
        return monthOver;
    }
}
