package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.Arrays;

public class KokoEatingBananas875 {
  public int minEatingSpeed(int[] piles, int h) {
      int l = 1;
      int r = Arrays.stream(piles).max().getAsInt();
      int res = r;

        while (l <= r) {
          int k = (l + r) / 2;

            long totalTime = 0;
            for (int p : piles) {
              totalTime += Math.ceil((double) p / k);
            }
            if (totalTime <= h) {
              res = k;
              r = k - 1;
            } else {
              l = k + 1;
            }
          }
        return res;
      }

  public static void main(String[] args) {
    int[] piles  = {3,6,7,11};
    KokoEatingBananas875 kokoEatingBananas875 = new KokoEatingBananas875();
    int result = kokoEatingBananas875.minEatingSpeed(piles ,8);
    System.out.println(result);

  }
}