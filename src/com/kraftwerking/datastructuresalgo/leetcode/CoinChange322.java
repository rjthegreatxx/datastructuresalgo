package com.kraftwerking.datastructuresalgo.leetcode;


class CoinChange322 {

  public int coinChange(int[] coins, int amount) {
    if (amount < 1) {
      return 0;
    }
    return helper(coins, amount, new int[amount + 1]);
  }

  private int helper(int[] coins, int rem,
      int[] count) { // rem: remaining coins after the last step; count[rem]: minimum number of coins to sum up to rem
    if (rem < 0) {
      return -1; // not valid
    }
    if (rem == 0) {
      return 0; // completed
    }
    if (count[rem] != 0) {
      return count[rem]; // already computed, so reuse
    }
    int min = Integer.MAX_VALUE;
    for (int coin : coins) {
      int res = helper(coins, rem - coin, count);
      if (res != -1) {
        min = Math.min(res + 1, min);
      }
    }
    count[rem] = (min == Integer.MAX_VALUE) ? -1 : min;
    return count[rem];
  }

  public static void main(String[] args) {
    int[] coins = {1, 2, 5};
    CoinChange322 coinChange322 = new CoinChange322();
    int result = coinChange322.coinChange(coins, 11);
    System.out.println(result);
  }
}