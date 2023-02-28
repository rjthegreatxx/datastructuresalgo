package com.kraftwerking.datastructuresalgo.leetcode;

class ReverseBits190 {

  public int reverseBits(int n) {
    if (n == 0) {
      return 0;
    }

    int result = 0;
    for (int i = 0; i < 32; i++) {
      result <<= 1;
      if ((n & 1) == 1) {
        result++;
      }
      n >>= 1;
    }
    return result;
  }

  public static void main(String[] args) {
    ReverseBits190 reverseBits190 = new ReverseBits190();
    int result = reverseBits190.reverseBits(43261596);
    System.out.println();
    System.out.println(result);
  }
}

