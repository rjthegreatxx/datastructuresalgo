package com.kraftwerking.datastructuresalgo.datastructurescourse.leetcode;


public class MaximumProductSubarray152 {

  public int maxProduct(int[] nums) {
      if (nums.length == 1) {
          return nums[0];
      }
    int largestProduct = Integer.MIN_VALUE;

    for (int i = 0; i < nums.length; i++) {
      int currentProduct = 1;
      for (int j = i; j < nums.length; j++) {
        currentProduct = currentProduct * nums[j];
        if (currentProduct > largestProduct) {
          largestProduct = currentProduct;
        }
      }
    }

    return largestProduct;
  }

  public static void main(String[] args) {
    int[] nums = {-4, -3};
    MaximumProductSubarray152 maximumProductSubarray152 = new MaximumProductSubarray152();
    int result = maximumProductSubarray152.maxProduct(nums);
    System.out.println(result);
  }
}