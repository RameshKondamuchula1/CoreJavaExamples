package com.java.examples;

import java.util.Arrays;

public class BuyAndSellMaxProfit {

    public static void main(String[] args) {
        BuyAndSellMaxProfit buyAndSellMaxProfit = new BuyAndSellMaxProfit();
        int[] stockPrices = {1,2,9,7,6};

        System.out.println("Max Profit: " + buyAndSellMaxProfit.getMaxProfit(stockPrices));
    }

    private int getMaxProfit(int[] stockPrices) {
        int maxProfit = 0;

        Arrays.sort(stockPrices);//{12679}

        int currentMinimum = Integer.MAX_VALUE;

        for (int i = 0; i < stockPrices.length; i++) {
            int presentValue = stockPrices[i];
            if (currentMinimum > presentValue) {
                currentMinimum = presentValue;
            }

            maxProfit = Math.max(maxProfit, presentValue) - currentMinimum;

        }
        return maxProfit;
    }
}
