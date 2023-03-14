package com.kraftwerking.datastructuresalgo.leetcode;


import java.util.Arrays;

public class KokoEatingBananas875 {
  public int minEatingSpeed(int[] piles, int h) {
    // Initalize the left and right boundaries
    int left = 1, right = 1;
    for (int pile : piles) {
      right = Math.max(right, pile);
    }

    while (left < right) {
      // Get the middle index between left and right boundary indexes.
      // hourSpent stands for the total hour Koko spends.
      int middle = (left + right) / 2;
      int hourSpent = 0;

      // Iterate over the piles and calculate hourSpent.
      // We increase the hourSpent by ceil(pile / middle)
      for (int pile : piles) {
        hourSpent += Math.ceil((double) pile / middle);
      }

      // Check if middle is a workable speed, and cut the search space by half.
      if (hourSpent <= h) {
        right = middle;
      } else {
        left = middle + 1;
      }
    }

    // Once the left and right boundaries coincide, we find the target value,
    // that is, the minimum workable eating speed.
    return right;
  }

  public static void main(String[] args) {
    int[] piles  = {3,6,7,11};
    KokoEatingBananas875 kokoEatingBananas875 = new KokoEatingBananas875();
    int result = kokoEatingBananas875.minEatingSpeed(piles ,8);
    System.out.println(result);

  }
}