package com.java.examples;

public class BuyAndSellMaxProfit {

    public static void main(String[] args) {
        int[] stockPrices = {2,8,1,7,6,9,10};

        System.out.println("Max Profit: " + maxProfit2(stockPrices));
    }

    static int maxProfit(int[] arr) {
        int profit = 0;
        int minimum = arr[0];
        for(int i = 1;i< arr.length;i++) {
            minimum =Math.min(arr[i], minimum);
            if(arr[i] > minimum) {
                profit = Math.max(profit, arr[i] - minimum);
            }
        }
        return profit;
    }

    static int maxProfit2(int[] arr) {
        int profit = 0;
        int minimum = arr[0];
        for(int i = 1;i< arr.length;i++) {

            if(arr[i]<minimum) {
                minimum = arr[i];
            }

            if(arr[i] > minimum) {
                if(profit < (arr[i] - minimum)) {
                    profit = arr[i] - minimum;
                }
            }

        }
        return profit;
    }
}
