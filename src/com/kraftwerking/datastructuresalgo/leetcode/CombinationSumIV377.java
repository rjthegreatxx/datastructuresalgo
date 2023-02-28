package com.kraftwerking.datastructuresalgo.leetcode;

class CombinationSumIV377 {

  public int combinationSum4(int[] nums, int target) {
    int res = 0;
    for (int i : nums) {
      System.out.println(i);
      if (target % i == 0) {
        res++;
      }
      for (int j : nums) {
        int rem = target - (i + j);
      }
    }

    System.out.println();
    return res;
  }

  public static void main(String[] args) {
    CombinationSumIV377 combinationSumIV377 = new CombinationSumIV377();
    int[] nums = {1, 2, 3};
    int target = 4;
    int result = combinationSumIV377.combinationSum4(nums, target);
    System.out.println(result);
  }
}