package com.kraftwerking.datastructuresalgo.leetcode;


class BestTimeToBuyAndSellStock121 {

  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int l = 0;
    int r = 1;

    while(r<prices.length){

      if(prices[l] < prices[r]){
        int profit = prices[r] - prices[l];
        maxProfit = Math.max(maxProfit, profit);
      } else {
        l = r;
      }
      r++;
    }

    return maxProfit;
  }

  public static void main(String[] args){
    int[] prices = {7,6,4,3,1};
    BestTimeToBuyAndSellStock121 bestTimeToBuyAndSellStock121 = new BestTimeToBuyAndSellStock121();
    int result = bestTimeToBuyAndSellStock121.maxProfit(prices);
    System.out.println(result);

  }
}