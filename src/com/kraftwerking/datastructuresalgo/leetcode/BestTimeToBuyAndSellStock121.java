package com.kraftwerking.datastructuresalgo.leetcode;


class BestTimeToBuyAndSellStock121 {

  public int maxProfitAttempt1(int[] prices) {
    int minPrice = -1;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (minPrice == -1) {
        minPrice = prices[i];
        continue;
      }
      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }
      int profit = prices[i] - minPrice;
      if (profit > maxProfit) {
        maxProfit = profit;
      }
    }


    return maxProfit;
  }

  public int maxProfit(int[] prices) {
    int minPrice = -1;
    int maxProfit = 0;

    for (int i = 0; i < prices.length; i++) {
      if (minPrice == -1) {
        minPrice = prices[i];
        continue;
      }

      if (prices[i] < minPrice) {
        minPrice = prices[i];
      }

      int profit = prices[i] - minPrice;
      maxProfit = Math.max(maxProfit, profit);

    }

    return maxProfit;
  }
}