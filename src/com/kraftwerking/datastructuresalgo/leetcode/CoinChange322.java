package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.Arrays;

class CoinChange322 {

  public int coinChange(int[] coins, int amount) {
    if (amount < 0 || coins.length == 0 || coins == null) {
      return 0;
    }
    int[] dp = new int[amount + 1];
    Arrays.fill(dp, amount + 1);
    dp[0] = 0;

    for (int i = 1; i <= amount; i++) {
      for (int coin : coins) {
        if (i - coin >= 0) {
          dp[i] = Math.min(dp[i], 1 + dp[i - coin]);
        }
      }
    }

    return dp[amount] != amount + 1 ? dp[amount] : -1;
  }

  public static void main(String[] args) {
    int[] coins = {1, 2, 5};
    CoinChange322 coinChange322 = new CoinChange322();
    int result = coinChange322.coinChange(coins, 11);
    System.out.println(result);
  }
}