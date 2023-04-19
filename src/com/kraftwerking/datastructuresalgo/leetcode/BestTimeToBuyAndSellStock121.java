package com.kraftwerking.datastructuresalgo.leetcode;


class BestTimeToBuyAndSellStock121 {

  public int maxProfit(int[] prices) {
    int maxProfit = 0;
    int l = 0;
    int r = 1;

    while(r<prices.length){
      if(prices[r] < prices[l]){
        l = r;
      } else {
        int cur = prices[r] - prices[l];
        maxProfit = Math.max(cur,maxProfit);
      }
      r++;
    }

    return maxProfit;
  }

  public static void main(String[] args){
    int[] prices = {2,1,4};
    BestTimeToBuyAndSellStock121 bestTimeToBuyAndSellStock121 = new BestTimeToBuyAndSellStock121();
    int result = bestTimeToBuyAndSellStock121.maxProfit(prices);
    System.out.println(result);

  }
}