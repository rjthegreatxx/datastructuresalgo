package com.kraftwerking.datastructuresalgo.leetcode;

import java.util.Arrays;

class CountingBits338 {

  public int[] countBits(int n) {
    int[] result = new int[n + 1];
    for (int i = 0; i <= n; i++) {
      int count = 0;
      int current = i;
      while (current != 0) {
        count = count + (current & 1);
        current = current >>> 1; //right shift with 0s
      }
      result[i] = count;

    }
    return result;
  }

  public static void main(String[] args) {
    CountingBits338 countingBits338 = new CountingBits338();
    int[] result = countingBits338.countBits(2);
    System.out.println(Arrays.toString(result));
  }
}

